
package testSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class docker {
    
    
    @Test
    public void ini() throws MalformedURLException {
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        URL url = new URL("http://34.70.184.252:4444/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url,dc);
        driver.get("https://www.google.com");
        driver.quit();
    }
    
}
