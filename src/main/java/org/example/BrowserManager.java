package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    static LoadProp loadProp = new LoadProp();
    String browser =loadProp.getProperty("Browser");
    // to open the browser
    public void openBrowser(){
        //to run program on chrome.// equalsIgnoreCase for to ignore upper or lower case.
        if (browser.equalsIgnoreCase("Chrome")){
            System.out.println("Your Browser is Chrome");
            driver = new ChromeDriver();
        }
        //to run program on Firefox.
        else if(browser.equalsIgnoreCase("Firefox")){
            System.out.println("Your Browser is Firefox");
            driver = new FirefoxDriver();
        }
        //to run program on Edge
        else if(browser.equalsIgnoreCase("Edge")){
            System.out.println("Your Browser is Edge");
            driver = new EdgeDriver();
        }
        //if wrong browser name
        else {
            System.out.println("Your Browser is name wrong"+browser);
        }
        //to open the url
        driver.get(loadProp.getProperty("Url"));

        //maximize the browser window
        driver.manage().window().maximize();

        //implicitlyWait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    //to close the browser
    public void closeBrowser(){
        driver.quit();
        //to close all WebBrowser page.
    }
}


