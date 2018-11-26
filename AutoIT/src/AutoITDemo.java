import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemo {

	public static WebElement element ; 
	
	public static void main(String[] args) throws InterruptedException {
	   
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.gmail.com/"); 
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vaibhavvmhaskar@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(text(),'Next')]")).click();
		//driver.findElement(By.xpath("//div[@jsname='YRMmle'][contains(text(),'Enter your password')]")).sendKeys("Ushey@412");

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@jsname='YRMmle'][contains(text(),'Enter your password')]")));
		//actions.click();
		actions.sendKeys("Ushey@412");
		actions.build().perform();
		
		//driver.findElement(By.xpath("//span[@class='RveJvd snByac'][contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		driver.findElement(By.xpath("//div[@title='Profile']")).click();
		driver.findElement(By.xpath("//div[@role='button'][contains(text(),'Select a photo')]")).click();
		
		

	}

}
