package testGitpackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertDemoo {
	
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() 
  {
	  //System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	  
	  WebDriverManager.edgedriver().setup();
	  
	  driver=new EdgeDriver();
	  driver.get("https://selenium.obsqurazone.com/index.php");
	  driver.manage().window().maximize();
 
	  }
  @Test
  public void titleVerifyMethod() 
  {
	  String title=driver.getTitle();
	  System.out.println(title);
	  String sampleTitle="Obsqura Testing";
	  Assert.assertEquals(title, sampleTitle, "Title mismatch");  //hard assert
	 
	  /*SoftAssert s=new SoftAssert();
	  s.assertEquals(title, sampleTitle, "Title mismatch"); 
	  Assert.assertNotNull(title); */
	      
  }


  @AfterTest
  public void afterTest()
  {
	  
	  driver.close();
  }

}
