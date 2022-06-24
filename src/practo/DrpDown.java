package practo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DrpDown {

//	String alloptions;
	
	@Test
	public void dropDownHandling() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Nachiket\\Setup\\GekoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement drpdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
    //      drpdown.click();
          
		Select se = new Select(drpdown);
		se.selectByVisibleText("India");
		List<WebElement> alloptions = se.getOptions();
		int size = alloptions.size();
		
		System.out.println(size+" "+alloptions);
		
		
		
		//		Thread.sleep(5000);
//		List<WebElement> options = driver.findElements(By.tagName("option"));
//		System.out.println(options.size());
		
//		for(int i=0;i<options.size();i++) {
//			
//			alloptions=options.get(i).getText();
//			System.out.println("all dropdown options are" + alloptions);
//				}
//		
//		if(alloptions.equals("India")) {
//			System.out.println(alloptions + "India option is selected from dropdown");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
