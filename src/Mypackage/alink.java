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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alink {
    public static void main(String[] args) {
    
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://www.inmar.com";
    driver.get(baseUrl);

    List <WebElement> list = driver.findElements(By.cssSelector("a"));

                     for(WebElement link:list)                             
                  {
                    System.out.println(link.getText());

                      }
    
}
}
