package Ejecuciones;


import Escenarios.Mvn.Esc_ConsultarLibrerias;
import Escenarios.Tiquetes.Esc_PaginaInicio;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BusquedaVuelos {
    WebDriver driver;


    @Before
    public void PreEjecucion() {
        Pag_Navegador pag_Navegador = new Pag_Navegador(driver);
        driver = pag_Navegador.AbrirNavegador("https://www.tiquetesbaratos.com/");

    }

    @After
    public void PostEjecucion() {
     //driver.close();

    }

    @Test
    public void RealizarConsultaTicketes() {
        Esc_PaginaInicio esc_paginainicio = new Esc_PaginaInicio(driver);
        esc_paginainicio.ConsultarVuelos(driver);
    }



    }


