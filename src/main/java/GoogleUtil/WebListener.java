package GoogleUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class WebListener implements WebDriverListener {

    @Override
    public void beforeClick(WebElement element) {
        System.out.println("Before clicking on: " + element.toString());
    }

    @Override
    public void afterClick(WebElement element) {
        System.out.println("After clicking on: " + element.toString());
    }
}
