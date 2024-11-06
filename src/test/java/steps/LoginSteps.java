package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
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
    public void tearDown(Scenario scenario) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept(); // Acepta la alerta
        } catch (NoAlertPresentException e) {
        }
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Captura de Pantalla en Fallo");
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
