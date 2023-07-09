package Seleneium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class First_Basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
        option.addArguments("start-maximized"); 
        option.addArguments("--incognito");
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, option);
        capabilities.setBrowserName("chrome");
        option.merge(capabilities);
        WebDriver  driver = new ChromeDriver(option);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        

	}

}
