package Waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class ImpliWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriverWait webDriverWait;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://qavbox.github.io/demo/delay/");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[value='Try me!']")).click();
        System.out.println("Start - " +new Date());



        try {
            System.out.println(driver.findElement(By.id("delay1")).getText());
            System.out.println("End - " +new Date());
        }catch (Exception e){
            System.out.println("End - " +new Date());
        }



        Thread.sleep(3000);
        driver.quit();
    }
}
