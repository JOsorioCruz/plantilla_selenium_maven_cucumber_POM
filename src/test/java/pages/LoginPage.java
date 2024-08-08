package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPage extends BasePage {

  public LoginPage(WebDriver driver) {
      super(driver);
  }
    @FindBy(css = "a[data-target='#signInModal']")
    private WebElement signup;

    @FindBy(css = "input#sign-username")
    private WebElement usernameField;

    @FindBy(css = "input#sign-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@onclick='register()']")
    private WebElement loginButton;

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickSignupButton() {
        signup.click();
    }

    public void registroExtisoso(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Esperar la alerta y verificar su mensaje
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertEquals("Sign up successful.", alertText);
        alert.accept();
    }
}

/*
 Actions actions = new Actions(driver);
 actions.sendKeys(org.openqa.selenium.Keys.ESCAPE).perform();
*/