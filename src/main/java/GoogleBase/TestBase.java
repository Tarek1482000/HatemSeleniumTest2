package GoogleBase;

import GoogleUtil.WebListener;
import SelectDriver.RunSeleniumOnChrome;
import SelectDriver.RunSeleniumOnMicrosoftEdge;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    private static WebDriver driver;
    public static Properties prop;
    public static EventFiringWebDriver e_driver;
    public static WebListener WebListenerr;

    public  TestBase() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\tarek\\Desktop\\Test\\src\\main\\java\\GoogleConfig\\config\\config.properties");
        prop.load(fis);
    }

    public void initialization(String URL ,String Browser) {

        if(Browser.equals("edge"))
        {
            driver = RunSeleniumOnMicrosoftEdge.getEdgeDriver();
        } else if (Browser.equals("chrome")) {
            driver = RunSeleniumOnChrome.getChromeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported Browser: " + Browser);
        }

        if(driver != null) {
//            e_driver =new EventFiringWebDriver(driver);
//            WebListenerr = new WebListener();
//            e_driver.register((WebDriverEventListener) WebListenerr);
//            driver = e_driver;

            driver.get(URL);
        }
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

}
