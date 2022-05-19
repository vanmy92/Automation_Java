package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class MutilSelectDropDrownSample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/signup/");
        Thread.sleep(2000);

        WebElement el=driver.findElement(By.id("tools"));
        Select select=new Select(el);


        /*select.selectByIndex(0);
        select.selectByValue("postman");
        select.selectByVisibleText("TestStackWhite");
        List<WebElement> selectedItems= select.getAllSelectedOptions();
        for (WebElement itemselected:selectedItems){
            System.out.println(itemselected.getText());
        }*/



        List<WebElement> options= select.getOptions();
        System.out.println("Dropdown items count: " +options.size());
        for(WebElement option: options){
            //System.out.println(option.getAttribute("value"));
            String str=option.getAttribute("value");
            if(str.equals("cypress")){
                option.click();
                Thread.sleep(4000);
            }
        }


        Thread.sleep(3000);
        driver.quit();
    }
}
