package Ejecuciones;


import Escenarios.Mvn.Esc_ConsultarLibrerias;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class BusquedaGoogle {
    WebDriver driver;


    @Before
    public void PreEjecucion() {
        Pag_Navegador pag_Navegador = new Pag_Navegador(driver);
        driver = pag_Navegador.AbrirNavegador("https://mvnrepository.com/");

    }

    @After
    public void PostEjecucion() {
        driver.close();

    }

    @Test
    public void RealizarConsultaGoogle() {
        Esc_ConsultarLibrerias esc_consultarLibrerias = new Esc_ConsultarLibrerias(driver);
        esc_consultarLibrerias.ConsultarLibreriaMvn(driver);
    }

    @Test
    public void RealizarConsultaVuelos() {



    }
}

