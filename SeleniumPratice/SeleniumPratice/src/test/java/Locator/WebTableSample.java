package Locator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTableSample {
    public static void main(String[] args) throws InterruptedException {
        WebDriverWait webDriverWait;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\my.nguyen\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/webtable/");
        Thread.sleep(2000);

        /*
        //reading header text
        List<WebElement> headers=driver.findElements(By.xpath("//table[@id='table01']/thead//th"));
        for (WebElement el: headers){
            System.out.println(el.getText());
        }
*/

        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='table01']/tbody/tr"));
        for (WebElement row:rows){
            List<WebElement> cols =row.findElements(By.tagName("td"));
            for (WebElement cellData: cols){
                System.out.println(cellData.getText());

            }
        }



        Thread.sleep(3000);
        driver.quit();
    }
}
