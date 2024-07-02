package GoogleTestCases;

import org.testng.FileAssert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Example {

    @Test
    public void testExample() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\tarek\\Desktop\\Test\\src\\main\\java\\GoogleConfig\\config\\config.properties");
        prop.load(fis);
        String URL = prop.getProperty("URL");
        System.out.println(URL);
    }
}
