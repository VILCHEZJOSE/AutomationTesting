package Ejecuciones;


import Escenarios.Facebook.Esc_PaginaInicioFacebook;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PruebaFacebook {
    WebDriver driver;


    @Before
    public void PreEjecucion() {
        Pag_Navegador pag_Navegador = new Pag_Navegador(driver);
        driver = pag_Navegador.AbrirNavegador("https://www.facebook.com/");

    }

    @After
    public void PostEjecucion() {
     //driver.close();

    }

    @Test
    public void RealizarConsultaIngreso() {
        Esc_PaginaInicioFacebook esc_paginainicio = new Esc_PaginaInicioFacebook(driver);
        esc_paginainicio.ConsultarIngresoFacebook(driver);
    }



    }


