package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import java.util.Random;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    Faker usuarioRandom = new Faker();
    int numero = new Random().nextInt(1000) + 1;

    @Given("Abro la ventana de inicio")
    public void abrirPaginaDeInicio() {
        WebDriverManager.chromedriver().setup();
        // Configuración de ChromeOptions para asegurarse de que el navegador no esté en modo headless
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Ejecuta el navegador en modo headless
        driver = new ChromeDriver(options);
        driver.get("https://www.demoblaze.com/");
        loginPage = new LoginPage(driver);
    }

    @When("ingreso usuario y contrasena")
    public void ingresarUsuarioYContrasena() {
        loginPage.clickSignupButton();
        loginPage.enterUsername(usuarioRandom.name().firstName() + numero);
        loginPage.enterPassword(usuarioRandom.name().username());
    }

    @And("hago click en el boton sing up")
    public void hacerClickEnElBotonSingUp() {
        loginPage.clickLoginButton();
    }

    @Then("alerta de registro exitoso")
    public void confirmarRegistroExitoso() {
        loginPage.registroExtisoso();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
