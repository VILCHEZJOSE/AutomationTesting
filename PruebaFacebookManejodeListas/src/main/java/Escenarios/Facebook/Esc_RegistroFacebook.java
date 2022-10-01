package Escenarios.Facebook;

import Entidades.Facebook.Ent_RegistroFacebook;
import Recursos.Utilidades.Rec_Global;
import org.openqa.selenium.WebDriver;

public class Esc_RegistroFacebook {

    public static WebDriver driver;

    public Esc_RegistroFacebook(WebDriver _driver){

        driver = _driver;
    }
    public void RegistroFacebook(Ent_RegistroFacebook ent_registrof){

        Rec_Global rec_global =new Rec_Global(driver);
        String btn_crearcuenta="//*[contains(text(),'Crear cuenta nueva')]";
        String inp_nombre ="//*[@name='firstname']";
        String inp_apellido ="//*[@name='lastname']";
        String inp_correo ="//*[@name='reg_email__']";
        String inp_correoconfirmo ="//*[@name='reg_email_confirmation__']";
        String inp_clave ="//*[@name='reg_passwd__']";
        String list_dia="//*[@name='birthday_day']";
        String list_mes="//*[@name='birthday_month']";
        String list_ano="//*[@name='birthday_year']";


        rec_global.Click(btn_crearcuenta);
        rec_global.Escribir(ent_registrof.nombre,inp_nombre);
        rec_global.Escribir(ent_registrof.apellido,inp_apellido);
        rec_global.Escribir(ent_registrof.correo,inp_correo);
        rec_global.Escribir(ent_registrof.correo,inp_correoconfirmo);
        rec_global.Escribir(ent_registrof.clave,inp_clave);
        rec_global.ListaValor(ent_registrof.dia,list_dia);
        rec_global.ListaTexto(ent_registrof.mes,list_mes);
        rec_global.ListaValor(ent_registrof.ano,list_ano);




    }
}
