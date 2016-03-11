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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class formfill {
    
    public static void main(String[] args) {
    
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://www.practiceselenium.com/practice-form.html";
    driver.get(baseUrl);
    
    driver.findElement(By.name("firstname")).sendKeys("Shruti");
    driver.findElement(By.name("lastname")).sendKeys("Saumya");
    driver.findElement(By.cssSelector("input[value='Female']")).click();
    driver.findElement(By.cssSelector("input[value='3']")).click();
    WebElement fav = driver.findElement(By.id("tea1"));
    fav.click();
    WebElement exc1 = driver.findElement(By.id("tool-0"));
    exc1.click();
    WebElement exc2 = driver.findElement(By.id("tool-1"));
    exc2.click();
    Select drpcont = new Select (driver.findElement(By.name("continents")));
    drpcont.selectByVisibleText("Asia");
    Select work = new Select (driver.findElement(By.name("selenium_commands")));
    work.selectByVisibleText("Browser Commands");
    work.selectByIndex(3);
    driver.findElement(By.name("submit")).submit();
       
    System.out.println("Navigating to:" + driver.getTitle());
    
    
}  
   
}
