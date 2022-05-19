package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class MutilWindowSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/links/");
        Thread.sleep(3000);

        String parentWindow =driver.getWindowHandle();
        driver.findElement(By.name("multiple")).click();
        Thread.sleep(3000);

        Set<String> windows= driver.getWindowHandles();
        System.out.println("No. windows - " + windows.size());
        for (String window: windows){
            if (!parentWindow.equals(window)){
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                if(driver.getTitle().contains("QAVBOX")){
                    System.out.println(driver.findElements(By.tagName("a")).size());
                }
                driver.close();
            }
        }


/*
        String parentWindow= driver.getWindowHandle();
        driver.findElement(By.name("NewTab")).click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iter=windows.iterator();
        String firstWindow= iter.next();
        String secondWindow= iter.next();


        driver.switchTo().window(secondWindow);
        driver.findElement(By.id("username")).sendKeys("Qavbox");
        //to-do
        System.out.println(driver.getTitle()); //2nd window title
        Thread.sleep(3000);
        driver.switchTo().window(firstWindow);
        System.out.println(driver.getTitle());*/

        Thread.sleep(3000);
        driver.quit();
    }
}
