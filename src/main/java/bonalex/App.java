package bonalex;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "selenium\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://4pda.to/");
        for (int i = 2; i <= 7; i++) {
            WebElement paginationBtn = webDriver.findElement(By.xpath(
                    "//*[@id=\"j31jcmz2kIq6\"]/ul/li["+i+"]/a"));
            Thread.sleep(1000);
            paginationBtn.click();
        }
        webDriver.quit();
    }
}
