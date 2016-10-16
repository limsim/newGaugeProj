package stepImpl;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by limsim on 14/10/2016.
 */
public class FishInWaterImpl {
    @Step("a fish in water")
    public void implementation1() {
        System.out.println("==================== fish in water");
        System.out.println("^^^^^^^^^^^^^^^^^^" + System.getProperty("webdriver.chrome.driver"));
        System.setProperty("webdriver.chrome.driver", System.getenv("webdriver.chrome.driver"));
        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.navigate().to("http://dpreview.com");
        chromeDriver.quit();
    }
}
