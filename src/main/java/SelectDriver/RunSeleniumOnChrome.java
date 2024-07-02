package SelectDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunSeleniumOnChrome {

    public static WebDriver getChromeDriver () {

//  Method1
//  System.setProperty("webdriver.chrome.driver","C:/Users/tarek/Desktop/Test/Driver/chromedriver-win64/chromedriver.exe");
//  WebDriver driver = new ChromeDriver();
//  driver.manage().window().maximize();


//  Method2
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
    }
}
