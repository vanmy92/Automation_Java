package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class CheckBoxSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        List<WebElement> checkboxBtns = driver.findElements(By.name("language"));
        System.out.println(checkboxBtns.size());  // should be 7

        for(WebElement btn: checkboxBtns){
            System.out.println(btn.getAttribute("value"));
            if(btn.getAttribute("value").equals("automationtesting")){
                btn.click();
                System.out.println("selected ? - " + btn.isSelected());
                System.out.println("checked ? - " + btn.getAttribute("checked"));
                //break;
            }
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='java']")).click();



        Thread.sleep(3000);
        driver.quit();
    }
}
