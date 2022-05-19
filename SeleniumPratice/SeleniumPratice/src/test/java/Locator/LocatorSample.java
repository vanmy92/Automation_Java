package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup");
        /*driver.findElement(By.className("EnterText")).sendKeys("QAVBox");
        driver.findElement(By.id("email")).sendKeys("QAVBox@gmail.com");
        driver.findElement(By.id("tel")).sendKeys("123456789");*/


        //Thread.sleep(3000);
        //driver.findElement(By.name("home")).click();
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("adg");
        driver.findElement(By.cssSelector("input[name='uname']")).sendKeys("asv");
        Thread.sleep(3000);

        driver.findElement(By.linkText("Tutorials!")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
