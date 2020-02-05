/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSelenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demotest {

    private WebDriver web;

    @Before
    public void ini() throws IOException {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/webdriver/chromedriver.exe");
        web = new ChromeDriver();
        web.manage().window().maximize();
        web.get("https://www.google.com");

    }

    @Test
    public void google() throws IOException {
        WebElement busqueda = web.findElement(By.name("q"));
        busqueda.sendKeys("Youtube");
        WebElement btn = web.findElement(By.id("tsf"));
        btn.click();
        TakesScreenshot ts = (TakesScreenshot) web;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./src/test/resources/Screenshot/demo.png"));
    }

//    @Test
//    public void login() {
//
//        try {
//            WebElement user = web.findElement(By.id("log:txtUser"));
//            user.sendKeys("Cesar");
//            WebElement pass = web.findElement(By.id("log:txtPass"));
//            pass.sendKeys("Cesar");
//            WebElement btn = web.findElement(By.id("log:aaa"));
//            btn.click();
//            Thread.sleep(5000);
//            WebElement itemMenu = web.findElement(By.id("menuform:sr_utils2"));
//            itemMenu.click();
//            empleado();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(demotest.class.getName()).log(Level.SEVERE, null, ex);
//            System.err.println("Error");
//        }
//
//    }
//    public void empleado() {
//        try {
////            WebElement Condi = web.findElement(By.name("FrmAgregar:j_idt38"));
////            Condi.click();
//            WebElement nombramiento = web.findElement(By.id("FrmAgregar:j_idt45"));
//            nombramiento.sendKeys("012102019");
//            WebElement ApePar = web.findElement(By.id("FrmAgregar:j_idt47"));
//            ApePar.sendKeys("Quispe");
//            WebElement ApeMat = web.findElement(By.id("FrmAgregar:j_idt50"));
//            ApeMat.sendKeys("Casas");
//            WebElement Nombre = web.findElement(By.id("FrmAgregar:j_idt53"));
//            Nombre.sendKeys("Juan");
//            WebElement DNI = web.findElement(By.id("FrmAgregar:j_idt56"));
//            DNI.sendKeys("15424546");
//            WebElement Ruc = web.findElement(By.id("FrmAgregar:j_idt58"));
//            Ruc.sendKeys("123659865123");
//            WebElement Tel = web.findElement(By.id("FrmAgregar:j_idt60"));
//            Tel.sendKeys("018562356");
//            WebElement Cel = web.findElement(By.id("FrmAgregar:j_idt62"));
//            Cel.sendKeys("986532145");
//            WebElement Email = web.findElement(By.id("FrmAgregar:j_idt64"));
//            Email.sendKeys("jQuispe@gmail.com");
//        } catch (Exception e) {
//            System.out.println("error" + e);
//        }
//    }
    @After
    public void cerrar() {
        //web.quit();
    }

}
