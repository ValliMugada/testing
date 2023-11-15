package New.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	
     
	
	public static void main(String[] args) {
		
	System.setProperty( "webdriver.chrome.driver",  "C:\\Users\\csukbama\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/\r\n");
     driver.manage().window().maximize();
//     driver.findElement(By.xpath("//button[@data cookiebanner='accept_button']")).click();
     WebElement emailInput = driver.findElement(By.id("email"));
     WebElement passwordInput = driver.findElement(By.id("pass"));
     WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
     
     emailInput.sendKeys("8332970188");
     passwordInput.sendKeys("vinay@8332970188");
     loginButton.click();
     
     driver.quit();
     
}
}
