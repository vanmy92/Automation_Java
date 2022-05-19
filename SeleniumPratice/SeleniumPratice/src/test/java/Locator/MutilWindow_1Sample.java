package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class MutilWindow_1Sample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/links/");
        Thread.sleep(3000);

        String parentWindow= driver.getWindowHandle();

        driver.findElement(By.name("multiple")).click();
        Set<String> windows=driver.getWindowHandles();
        System.out.println("NO . Window  :"+windows.size());

        for (String window:windows){
            if(!parentWindow.equals(window)){
                driver.switchTo().window(window);
                System.out.println(""+driver.getTitle());
                if(driver.getTitle().contains("QAVBOX")){
                    System.out.println(driver.findElements(By.tagName("a")).size());
                }
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);

        System.out.println(driver.getTitle());

        /*driver.findElement(By.name("NewTab")).click();

        Set<String> windows= driver.getWindowHandles();
        Iterator<String> iter=windows.iterator();
        String firstWindow=iter.next();
        String secondWindow=iter.next();

        driver.switchTo().window(secondWindow);
        driver.findElement(By.id("username")).sendKeys("QAX BOX");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.switchTo().window(firstWindow);
        System.out.println(driver.getTitle());*/

        Thread.sleep(3000);
        driver.quit();
    }
}
