package mypackage;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Myclass {
 
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        
        driver.get(baseUrl);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        
        driver.close();
        System.exit(0);
    }
 
}