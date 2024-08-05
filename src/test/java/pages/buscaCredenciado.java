package pages;


import java.util.concurrent.TimeUnit;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import suporte.generator;
import suporte.screenshot;


public class buscaCredenciado {

	public static WebDriver navegador;
	
    @Rule
    public static TestName test = new TestName();
    
	@Test
	public void que_acesso_o_Site_Soc() throws Throwable {
		//navegador = Web.createChrome();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Luiz Fernando\\Documents\\Qaut\\java\\sitesoc\\drives\\chromedriver.exe");
        navegador = new ChromeDriver();
    	navegador.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    //Navegando para pagina
    	navegador.get("https://socnet.soc.com.br/");
    	navegador.manage().window().maximize();
	}
	
	@Test
	public void quando_preencho_os_filtros_para_buscar_um_credenciado() throws Throwable {
	    navegador.findElement(By.xpath("//span[contains(.,'Empresa')]")).click();
	    navegador.findElement(By.id("ipt-busca-credenciado-2")).sendKeys("analises clinicas");
	    navegador.findElement(By.xpath("//div[@id='div-filtro-conveniencias']/section/div[2]/label/span")).click();
	    navegador.findElement(By.id("botao-buscar")).click();
	    navegador.findElement(By.xpath("//div[@id='conteudo-resultados']/div/div/div/div/section/div[2]/span")).click();
	}
	
	@Test
	public void clico_em_saiba_mais() throws Throwable {
		navegador.findElement(By.xpath("//button[contains(.,'Saiba mais')]")).click();
	}
	
	@Test
	public void visualizo_o_perfil_do_credenciado() throws Throwable {
		navegador.findElement(By.xpath("//div[@id='div-header-perfil']/div/div[3]/div/span")).click();
		navegador.findElement(By.xpath("//div[@id='div-perfil-empresa']/div[2]/section/div[2]/span")).click();
		screenshot.tirar(navegador, "C:\\Users\\Luiz Fernando\\Documents\\Qaut\\java\\sitesoc\\evidencia\\" + generator.dataHoraParaArq() + "Resultado.png");
        navegador.close();
	}


}
