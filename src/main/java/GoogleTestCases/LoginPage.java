package GoogleTestCases;

import GoogleBase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginPage extends TestBase {

    public LoginPage() throws IOException {
        super();
    }

    @BeforeMethod
    public void setup() throws IOException {

        String URL = prop.getProperty("URL");
        String ChromeBrowser = prop.getProperty("ChromeBrowser");
        String EdgeBrowser = prop.getProperty("EdgeBrowser");

        initialization(URL,EdgeBrowser);
        quit();
    }

    @Test
    public void testLogin() {
        // Your test code here
    }
}
