package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
	public static WebDriver createChrome() {
		//Abrir navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luiz Fernando\\Downloads\\cucumber\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        
        //Navegando para pagina
        navegador.get("https://www.soc.com.br/blog-de-sst/");
		
       return navegador; 
	}
}
