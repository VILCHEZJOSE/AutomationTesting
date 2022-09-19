package Escenarios.Tiquetes;

import Recursos.Utilidades.Rec_Global;
import org.openqa.selenium.WebDriver;

public class Esc_PaginaInicio {

    WebDriver driver;

    public Esc_PaginaInicio(WebDriver _driver){
        driver = _driver;
    }
    public void ConsultarVuelos(WebDriver driver){

        Rec_Global rec_global = new Rec_Global(driver);
        String ciudadOrigen = "//*[@name='origen']";
        String ciudadDestino = "//*[@name='destino']";


        rec_global.Escribir("Medellin - Colombia(EOH)", ciudadOrigen);
        rec_global.Escribir("Bogota - Colombia (BOG)", ciudadDestino);

    }
}
