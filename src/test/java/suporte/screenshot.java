package suporte;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class screenshot {
	public static void tirar(WebDriver navegador, String arquivo) {
		File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try { 
		FileUtils.copyFile(screenshot, new File(arquivo));
		}catch (Exception e) {
			System.out.println("Houve problema ao copiar o arquivo para pasta: " + e.getMessage());
		}
	}
}
