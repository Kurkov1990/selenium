import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Buttons {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Andrey\\IdeaProjects\\selenium\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();


        driver.get("https://en.wikipedia.org/");

        driver.findElement(By.xpath("//*[@id=\"searchButton\"]")).click();

        driver.get("https://github.com");

        WebElement button = driver.findElement(By.xpath("/html/body/div[4]/main/div[1]/div/div/div[2]/div/form/button"));
        if (button.getText().equals("Sign up for GitHub")) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
      //  button.submit();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]")).click();

        driver.get("https://uk-ua.facebook.com/");

        driver.findElement(By.cssSelector("#u_0_2")).submit();

   //     driver.quit();
    }
}
