package eCommerce_testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonTest() throws InterruptedException {
	  WebDriver d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().deleteAllCookies();
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.get("https://www.amazon.in/");
	  
	  Thread.sleep(5000);
	  d.quit();
  }
}
