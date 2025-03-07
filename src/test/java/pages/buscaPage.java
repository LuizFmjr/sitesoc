package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import suporte.generator;
import suporte.screenshot;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class buscaPage {

	public static WebDriver navegador;
	String pesquisa = "pesquisa";

	@Rule
	public static TestName test = new TestName();

	@Before
	public void setUp() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Luiz Fernando\\Documents\\Qaut\\java\\sitesoc\\drives\\chromedriver.exe");
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		navegador.get("https://www.soc.com.br/blog-de-sst/");
		navegador.manage().window().maximize();
	}

	@Test
	public void que_acesso_o_blog_Soc() throws Throwable {
		// O navegador já foi configurado no método setUp
	}

	@Test
	public void preencho_o_campo_de(String pesquisa) throws Throwable {
		navegador.findElement(By.xpath("//div[2]/div/div/section/div/div/div/div/div/div/div/form/div/input")).click();
		navegador.findElement(By.xpath("//div[2]/div/div/section/div/div/div/div/div/div/div/form/div/input"))
				.sendKeys(pesquisa);
		navegador.findElement(By.xpath("//button/div")).click();
	}

	@Test
	public void visualizo_o_resultado_da_pesquisa() throws Throwable {
		WebElement mensagemPop = navegador.findElement(By.tagName("span"));
		String msg = mensagemPop.getText();
		assertEquals("span", "span");
		screenshot.tirar(navegador, "C:\\Users\\Luiz Fernando\\Documents\\Qaut\\java\\sitesoc\\evidencia\\"
				+ generator.dataHoraParaArq() + "Resultado.png");
		navegador.close();
	}
}
