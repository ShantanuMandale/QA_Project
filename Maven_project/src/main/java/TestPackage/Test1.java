package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;   
public class Test1 {

    @Test
    public void a() {
    	System.out.println("Hello a test method");
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://github.com/ShantanuMandale/QA_Project");
    	System.out.println("Url opened");
    	
    	System.out.println("Hello Mybranch");
        
    }
}