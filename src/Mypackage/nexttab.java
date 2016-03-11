/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Shruti
 */
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nexttab {
    public static void main(String[] args) {
    
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://www.seleniumframework.com/Practiceform/";
    driver.get(baseUrl);
    
    driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
    
    List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(browserTabs .get(1));
    System.out.println("Title of page on the new tab:" + driver.getTitle());
    System.out.println("Total number of windows open:" + browserTabs.size());
    
    for (String browser : browserTabs) {
 
    driver.switchTo().window(browser);
    System.out.println("Title on Window" + browser + "is" + driver.getTitle());
    }
    }
}
