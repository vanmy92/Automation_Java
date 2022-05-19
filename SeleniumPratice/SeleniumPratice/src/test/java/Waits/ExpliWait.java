package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class ExpliWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverWait webDriverWait;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://qavbox.github.io/demo/delay/");
        Thread.sleep(2000);
        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(15));
        /*
        driver.findElement(By.cssSelector("input[value='Click me!']")).click();
        System.out.println("Start - " +new Date());



        try {

            webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("two")), "I am here!"));
             System.out.println("Text - "+driver.findElement(By.id("two")).getText());
            System.out.println("End - " +new Date());
        }catch (Exception e){
            System.out.println("End - " +new Date());
        }
*/
/*
        WebElement button=driver.findElement(By.id("delay"));
        button.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(button)).click();
*/

        webDriverWait.until(ExpectedConditions.titleIs(""));


        Thread.sleep(3000);
        driver.quit();
    }
}
