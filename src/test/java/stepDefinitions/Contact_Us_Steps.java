package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;


public class Contact_Us_Steps extends Base_PO {
    private WebDriver driver = getDriver();

    private ContactUs_PO contactUs_po;

    public Contact_Us_Steps(){
        this.contactUs_po = new ContactUs_PO();
    }
    @Given("I access the webdriver univeristy contact us page")
    public void i_access_the_webdriver_univeristy_contact_us_page() {
        contactUs_po.naviageTo_WebdriverUniversity_Contact_Us_Page();
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUs_po.setFirstName("AutoFN" + generateRandomNumber(5));
    }
    @When("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUs_po.setLastName("AutoLN" + generateRandomNumber(5));
    }
    @When("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUs_po.setEmail(generateRandomNumber(5) + "@test.com" );
    }
    @When("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUs_po.setComment("Hello World " + generateRandomString(20));
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUs_po.setFirstName(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUs_po.setLastName(lastName);
    }
    @When("I enter a specific specific email address {word}")
    public void i_enter_a_specific_specific_email_address(String email) {
        contactUs_po.setEmail(email);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUs_po.setComment(comment);
    }
    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        contactUs_po.clickSubmit();
    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUs_po.validate_Successful_SubmissionMessage_Text();
    }
}
