package testSelenium;

import java.io.File;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

  private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/webdriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://developers.vallegrande.edu.pe/Legajos/");
    }

    @Test
    public void login() {

        WebElement user = driver.findElement(By.id("log:txtUser"));
        user.sendKeys("Cesar");
        WebElement pass = driver.findElement(By.id("log:txtPass"));
        pass.sendKeys("Cesar");
        WebElement btn = driver.findElement(By.id("log:aaa"));
        btn.click();
        WebElement empl = driver.findElement(By.linkText("Empleado"));
        empl.click();
        
    }

}
