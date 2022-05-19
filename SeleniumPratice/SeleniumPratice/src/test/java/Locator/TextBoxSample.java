package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        String str="QAVBOX";
        WebElement el=driver.findElement(By.id("username"));
        el.sendKeys(str);

        String actual=el.getAttribute("value");
        if(actual.equals(str)){
            System.out.println("Test case passed");
        }
        Thread.sleep(3000);
        el.clear();

        actual =el.getAttribute("value");
        System.out.println("After clear - " +actual);
        if(actual.equals("")){
            System.out.println("clear - Test case passed");
        }
        Thread.sleep(3000);
        el.clear();


        Thread.sleep(3000);
        driver.quit();
    }
}
