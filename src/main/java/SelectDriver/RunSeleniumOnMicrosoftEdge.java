package SelectDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunSeleniumOnMicrosoftEdge {

    public static WebDriver getEdgeDriver() {

//    Method1
    System.setProperty("webdriver.edge.driver","C:/Users/tarek/Desktop/Test/Driver/MicrosoftWebDriver/MicrosoftWebDriver.exe");
    WebDriver driver = new EdgeDriver();
    driver.manage().window().maximize();


//    Method2
//    WebDriverManager.edgedriver().setup();
//    WebDriver driver = new EdgeDriver();
//    driver.manage().window().maximize();
//    driver.get("https://www.google.com/");

        return driver;
    }
}
