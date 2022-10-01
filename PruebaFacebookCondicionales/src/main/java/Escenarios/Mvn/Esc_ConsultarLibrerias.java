package Escenarios.Mvn;

import Recursos.Utilidades.Rec_Global;
import org.openqa.selenium.WebDriver;

public class Esc_ConsultarLibrerias {
    WebDriver driver;

    public Esc_ConsultarLibrerias(WebDriver _driver){
        driver = _driver;
    }
    public void ConsultarLibreriaMvn(WebDriver driver){

        Rec_Global rec_global = new Rec_Global(driver);
        rec_global.Escribir("selenium", "//*[@name='q']");
        rec_global.Click("//*[@type='submit']");

    }
}
