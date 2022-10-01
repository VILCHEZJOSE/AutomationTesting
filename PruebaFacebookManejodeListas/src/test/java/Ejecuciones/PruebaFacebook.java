package Ejecuciones;


import Entidades.Facebook.Ent_LoginFacebook;
import Escenarios.Facebook.Esc_PaginaInicioFacebook;
import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PruebaFacebook {
    WebDriver driver;
    Ent_LoginFacebook entloginf;
    Esc_PaginaInicioFacebook esc_paginainiciof;


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
        esc_paginainiciof = new Esc_PaginaInicioFacebook(driver);
        entloginf = new Ent_LoginFacebook();
        LecturaDatos();

        }


    public void LecturaDatos(){

        entloginf.clave="123323234555";
        entloginf.usuario="JOSEVILCHEZMASQUEZ";
    }

    @Test
    public void RealizarConsultaIngreso() {
        InstanciasBasicas();
        esc_paginainiciof.ConsultarIngresoFacebook(driver,entloginf.clave, entloginf.usuario);
    }

    }


