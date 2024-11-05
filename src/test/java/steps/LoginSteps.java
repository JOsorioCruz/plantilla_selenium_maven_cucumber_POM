package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;


public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;


    @Given("Abro la ventana de inicio")
    public void abrirPaginaDeInicio() {
        BasePage basePage = new BasePage(null);
        driver = basePage.getDriver();
        driver.get("https://www.demoblaze.com/");
        loginPage = new LoginPage(driver);
    }

    @When("ingreso usuario y contrasena")
    public void ingresarUsuarioYContrasena() {
        loginPage.clickSignupButton();
        loginPage.enterUsername(loginPage.nombreRandom());
        loginPage.enterPassword(loginPage.appellidoRandom());
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
