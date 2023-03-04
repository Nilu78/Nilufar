import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class ClassWork {


    @Test


    public void test1()  throws AWTException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.modanisa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).click();

        WebElement element = driver.findElement(By.xpath("//a[@class='right menu-link']"));


        Actions actions = new Actions(driver);

        actions.contextClick(element). sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN , Keys.ARROW_DOWN , Keys.ENTER ).build().perform();


        


    }
}
