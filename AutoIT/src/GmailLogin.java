import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static String projectLocation = System.getProperty("user.dir");

	public static WebDriver driver;

	
	public static void main(String[] args) {
 
		
		System.setProperty("webdriver.chrome.driver",projectLocation+"\\lib\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
	 
		
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("vaibhavvmhaskar@gmail.com"); 
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ushey@412");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//span[@class='gb_9a gbii']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[@class='gb_za gb_4f gb_ag gb_Pe gb_Fb']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
	}


	}


