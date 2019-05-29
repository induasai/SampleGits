package AutoITCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class AutoITGITSMavenJen {
	public static WebDriver driver;
	
	@BeforeClass
	public static WebDriver getBrowser() throws Exception
	{	
		driver = new ChromeDriver();
		return driver;
			
	}
  @Test
  public void UploadPic() throws Exception
  {
	  driver.get("https://www.edureka.co");
	  driver.manage().window().maximize();
	//Log into the site
		 driver.findElement(By.linkText("Log In")).click();
		 Thread.sleep(2000);
		 WebDriverWait id = new WebDriverWait(driver,400);
		 id.until(ExpectedConditions.presenceOfElementLocated(By.id("si_popup_email")));
		 driver.findElement(By.id("si_popup_email")).sendKeys("indu.asai@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.id("si_popup_email")).sendKeys(Keys.TAB);
			//Key in Password
		WebDriverWait pwd = new WebDriverWait(driver,200);
		pwd.until(ExpectedConditions.presenceOfElementLocated(By.id("si_popup_passwd")));
		driver.findElement(By.id("si_popup_passwd")).sendKeys("HarshiMri2");
		
		driver.findElement(By.id("si_popup_passwd")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[3]/form/button")).click();
		Thread.sleep(2000);
		
		//Click on My Profile link
		
		driver.findElement(By.className("user_image")).click();
		driver.findElement(By.linkText("My Profile")).click();
		driver.findElement(By.xpath("//*[@id='personal_details']/i")).click();
		driver.findElement(By.xpath("//*[@id='collapseOne']/div/div/div[2]/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='custom-input']")).click();
		Thread.sleep(500);
		//Run the file to upload the picture
		Runtime.getRuntime().exec("C:\\Users\\User\\workspace\\AutoIT.exe");
		Thread.sleep(600);
		driver.findElement(By.xpath("//*[@id='onboarding']/div/div[1]/div[2]/div[2]/app-onboarding-personal-details/div[2]/div/div/div[2]/div[2]/button")).click();
		driver.close();
  }
}
