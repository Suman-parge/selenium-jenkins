package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommanUtils.PropertyFileUtil;
import CommanUtils.WebDriverUtil;

public class OrganizationTest {
	@Test
	public void CreateOrganizationTest() throws IOException {
		


		//PropertyFileUtil putil=new PropertyFileUtil();
		//WebDriverUtil wutil=new WebDriverUtil();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:8888/");
		

		
		
			//String URL = putil.getDataFromPropertyFile("Url");
			
			//wutil.maximize(driver);
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//wutil.implicitwait(driver);
			
			//to read data from property file
			
			//String URL = putil.getDataFromPropertyFile("Url");
			//String USERNAME = putil.getDataFromPropertyFile("Username");
			//String PASSWORD = putil.getDataFromPropertyFile("Password");
			
		//driver.get(URL);
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
	}

}
