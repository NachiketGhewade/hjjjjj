package practo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IframeHandling {

	@Test
	public void frame() {

		System.setProperty("webdriver.gecko.driver",
				"F:\\Nachiket\\Setup\\GekoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.google.com");

		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']"));
		button.click();
		driver.switchTo().defaultContent();

		driver.findElement(By.linkText("Gmail")).click();
		driver.quit();

	}

}
