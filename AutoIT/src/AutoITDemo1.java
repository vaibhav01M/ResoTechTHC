import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITDemo1 {

	public static WebElement element ; 
	
	public static void main(String[] args) throws InterruptedException, IOException {
	   
		String projectLocation = System.getProperty("user.dir"); // it gives project location
		System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching Browser
		
 		driver.get("http://demo.automationtesting.in/Register.html"); // loading url
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("//input[@id='imagesrc' and @onchange='uploadimg()']")).click(); // clicking on choose Button
		
		Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\uploadingScript.au3"+ " " +"F:\\Donald Trump.jpg");
	//  Runtime.getRuntime().exec("-----------xxxxx.exe file path---------------"+ " " +"path of file to be uploaded"); 

	}

}
