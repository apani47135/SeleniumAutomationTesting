package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps extends Base_PO {
    private static final Logger log = LoggerFactory.getLogger(Login_Steps.class);
    private WebDriver driver = getDriver();

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){
        this.login_po = login_po;
    }

    public Login_Steps() {
        this.login_po = new Login_PO();  // Manually instantiate dependencies
    }


    @Given("I access the webdriver univeristy login page")
    public void i_access_the_webdriver_univeristy_login_page() {
        login_po.navigateTo_WebdriverUniversity_Login_Page();
    }
    @When("I enter a username {word}")
    public void i_enter_a_username(String username) {
        login_po.setUsername(username);
    }

    @When("I enter a password {word}")
    public void i_enter_a_password(String password) {
        login_po.setPassword(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        login_po.clickSubmit();
    }

    @Then("I should be presented with message {}")
    public void i_should_be_presented_with_message(String message) {
        login_po.waitForAlert_And_ValidateText(message);
    }
}
