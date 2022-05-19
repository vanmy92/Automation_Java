package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ButtonSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        WebElement el=driver.findElement(By.name("home"));

        /*List<WebElement> buttons= (List<WebElement>) driver.findElement(By.name("home"));
        System.out.println(buttons.size());*/

        String str=el.getAttribute("value");
        if(str.equals("Home")){
            System.out.println("Testcase passed");
        }

        el.click();
        System.out.println(driver.getCurrentUrl());





        Thread.sleep(3000);
        driver.quit();
    }
}
