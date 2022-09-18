package Recursos.Navegador;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Pag_Navegador {
    WebDriver driver;

    public Pag_Navegador(WebDriver _driver) {
        driver = _driver;

    }
        public WebDriver AbrirNavegador(){
        System.setProperty("webdriver.chrome.driver","C:/Driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://mvnrepository.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        return driver;


    }
}
