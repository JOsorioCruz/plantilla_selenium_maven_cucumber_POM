package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Random;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            this.driver = new ChromeDriver(options);
        } else {
            this.driver = driver;
        }
        PageFactory.initElements(this.driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String nombreRandom (){
        int numero = new Random().nextInt(1000) + 1;
        Faker usuarioRandom = new Faker();
        return numero + usuarioRandom.name().firstName();
    }

    public String appellidoRandom (){
        Faker usuarioRandom = new Faker();
        return usuarioRandom.name().lastName();
    }
}
