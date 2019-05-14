import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class ComboBox {

    static WebDriver driver;

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Andrey\\IdeaProjects\\selenium\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();


        driver.get("http://accounts.google.com/SignUp?service=mail&hl=ru&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-ru");


        selectOption("Пол", "Мужской");
        selectOption("Страна", "Ангола (Angola)");

    }

    public static void selectOption(String listName, String option){
        String listXpath = String.format("(//strong[text()='%s']/following-sibling::div/div[@role='listbox'])[1]", listName);
        String optionXpath = String.format("//div[text()='%s']/parent::div[@role='option']", option);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();

    }

}
