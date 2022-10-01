package Ejecuciones;

import Entidades.Facebook.Ent_LoginFacebook;
import Entidades.Facebook.Ent_RegistroFacebook;
import Escenarios.Facebook.Esc_PaginaInicioFacebook;
import Escenarios.Facebook.Esc_RegistroFacebook;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistroFacebook {
    public static WebDriver driver;
    Ent_RegistroFacebook ent_registrof;
    Esc_PaginaInicioFacebook esc_paginainiciof;
    Esc_RegistroFacebook esc_registrof;

    @Before
    public void PreEjecucion() {
        Pag_Navegador pag_Navegador = new Pag_Navegador(driver);
        driver = pag_Navegador.AbrirNavegador("https://www.facebook.com/");
    }

    @After
    public void PostEjecucion() {
        //driver.close();
    }

    public void InstanciasBasicas(){

        esc_registrof = new Esc_RegistroFacebook(driver);
        ent_registrof = new Ent_RegistroFacebook();
        LecturaDatos();

        }
    public void LecturaDatos(){

        ent_registrof.nombre = "JOSE";
        ent_registrof.apellido = "VILCHEZ";
        ent_registrof.correo= "josevilchezmasquez@gmail.com";
        ent_registrof.clave = "123456789";
        ent_registrof.dia = "1";
        ent_registrof.mes = "jul";
        ent_registrof.ano = "1997";

    }

    @Test
    public void RealizarRegistroIngreso() {
        InstanciasBasicas();
        esc_registrof.RegistroFacebook(ent_registrof);
       }

}


