package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/iframes/");
        Thread.sleep(2000);

        WebElement frame1=driver.findElement(By.xpath("//iframe[1]"));
        driver.switchTo().frame(frame1);


        System.out.println(driver.findElement(By.id("frametext")).getText());
        System.out.println(driver.findElements(By.tagName("a")).size());
        Thread.sleep(3000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame("Frame2").switchTo();
        driver.findElement(By.id("frameinput")).sendKeys("abcbox   box");
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Pavilion")).click();
        Thread.sleep(5000);




        Thread.sleep(3000);
        driver.quit();
    }
}
