package Escenarios.Facebook;

import Recursos.Utilidades.Rec_Global;
import org.openqa.selenium.WebDriver;

public class Esc_PaginaInicioFacebook {

    WebDriver driver;

    public Esc_PaginaInicioFacebook(WebDriver _driver){

        driver = _driver;
    }
    public void ConsultarIngresoFacebook(String clave, String usuario){

        Rec_Global rec_global = new Rec_Global(driver);
        String ciudadOrigen = "//*[@name='email']";
        String ciudadDestino = "//*[@name='pass']";


        rec_global.Escribir(usuario, ciudadOrigen);
        rec_global.Escribir(clave, ciudadDestino);

    }
}
