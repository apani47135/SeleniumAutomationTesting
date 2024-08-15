package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class ContactUs_PO extends Base_PO{
    private @FindBy(xpath = "//*[@id=\"contact_form\"]/input[1]") WebElement firstName_TextField;
    private @FindBy(xpath = "//*[@id=\"contact_form\"]/input[2]") WebElement lastName_TextField;
    private @FindBy(xpath = "//*[@id=\"contact_form\"]/input[3]") WebElement email_TextField;
    private @FindBy(xpath = "//*[@id=\"contact_form\"]/textarea" ) WebElement comment_TextField;
    private @FindBy(xpath = "//*[@id=\"form_buttons\"]/input[2]") WebElement submit_Button;
    private @FindBy(xpath = "//*[@id=\"contact_reply\"]/h1") WebElement successfulSubmission_Message_Text;

    public ContactUs_PO(){
        super();
    }

    public void naviageTo_WebdriverUniversity_Contact_Us_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL+"/Contact-Us/contactus.html");
    }

    public void setFirstName(String name){
        sendKeys(firstName_TextField, name);
    }

    public void setLastName(String name){
        sendKeys(lastName_TextField, name);
    }

    public void setEmail(String email){
        sendKeys(email_TextField, email);
    }

    public void setComment(String comment){
        sendKeys(comment_TextField, comment);
    }

    public void clickSubmit(){
        waitForWebElementAndClick(submit_Button);
    }

    public void validate_Successful_SubmissionMessage_Text(){
        waitFor(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(), "Thank You for your Message!");
    }
}
