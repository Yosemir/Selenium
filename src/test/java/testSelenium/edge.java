
package testSelenium;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class edge {
    
   private WebDriver web;
   
   @After
   public void init(){
       System.setProperty("webdriver.edge.driver", "./src/test/resources/webdriver/geckodriver.exe");
       web = new EdgeDriver();
       web.manage().window().maximize();
       web.get("http://developers.vallegrande.edu.pe/Legajos/");
   }
   
   @Test
   public void test(){
       WebElement user = web.findElement(By.id("log:txtUser"));
        user.sendKeys("Cesar");
        WebElement pass = web.findElement(By.id("log:txtPass"));
        pass.sendKeys("Cesar");
        WebElement btn = web.findElement(By.id("log:aaa"));
        btn.click();
   }
    
}
