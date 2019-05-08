import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FindElement {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Andrey\\IdeaProjects\\selenium\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://en.wikipedia.org/");

        driver.findElement(By.linkText("Log in"));

        WebElement link = driver.findElement(By.linkText("Log in"));
        WebElement link2 = driver.findElement(By.partialLinkText("Wikipedia"));
        WebElement searchfield = driver.findElement(By.name("search"));
        WebElement searchButton =  driver.findElement(By.className("searchButton"));
        WebElement viewSource =  driver.findElement(By.id("ca-viewsource"));
        WebElement input = driver.findElement(By.tagName("input"));
        WebElement element = driver.findElement(By.cssSelector("#searchInput"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"p-logo\"]/a"));


        driver.quit();

    }

}
