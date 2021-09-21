package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;


public class Utils {
	
	public static WebDriver driver;
	
	public static void  acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Abrir em tela cheia
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // a cada execução que ele fizer a tela deve carregar ate  5 segundos
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static <T> T Na(Class<T> classe){
		return PageFactory.initElements(driver, classe);
	}
	
	public static void capturarTela(Scenario scenario ) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "Captura de tela");
		//scenario.attach(screenshot, "image/png", "Captura de tela");
	} 

}
