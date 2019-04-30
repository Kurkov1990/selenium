import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class MainClass {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\kurkov\\IdeaProjects\\test_selenium\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver( options );

        driver.get("https://www.seleniumhq.org/");

    }

}
