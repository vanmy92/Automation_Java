package Locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AltersSample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverWait webDriverWait;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/alerts/");
        Thread.sleep(2000);

        /*driver.findElement(By.name("commit")).click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();     simple alter
        alert.accept();*/

/*
        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("confirm")).click();
        Alert alert=webDriverWait.until(ExpectedConditions.alertIsPresent());

        alert.dismiss();
        String text=driver.findElement(By.id("Parademo")).getText();
        Thread.sleep(2000);
        if (text.contains("Cancel")){
            System.out.println("test case passed");
        }
*/



        webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("prompt")).click();
        Alert alert=webDriverWait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("abcbox");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);

        String text=driver.findElement(By.id("Parademo")).getText();
        Thread.sleep(2000);
        if (text.contains("abcbox")){
            System.out.println("test case passed");
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
