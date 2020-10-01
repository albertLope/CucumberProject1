package StepDefinition;

import POMClasses.ContactUsPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;
import Utilities.DriverClass;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class ContactUsSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Given("^Navigate to website$")
    public void navigate_to_website(){

        WebDriver driver = DriverClass.getDriver();

        driver.get(" http://automationpractice.com/");

        driver.manage().window().maximize();
    }

    @And("^Login to website username as \"([^\"]*)\" password as \"([^\"]*)\"$")
    public void login_to_website_username_as_password_as(String username, String password) throws Throwable {

        loginPage.findElementAndClickFunctionality("SignInButton");
        loginPage.findElementAndSendKeysFunction("EmailInput" , username);
        loginPage.findElementAndSendKeysFunction("PasswordInput" , password );
        loginPage.findElementAndClickFunctionality("SubmitLoginSignInButton");

    }


    @Then("^\"([^\"]*)\" message should be displayed$")
    public void messageShouldBeDisplayed(String whichMessage) {
        contactUsPage.handleAlerts(whichMessage);
    }

    @When("^User fill the contact us page and Message is \"([^\"]*)\"$")
    public void userFillTheContactUsPageAndMessageIs(String messageName) {

        homePage.findElementAndClickFunctionality("ContactUsButton");
        contactUsPage.FindElementAndHandleDropdown("subjectHeadingDropdown");
        contactUsPage.FindElementAndHandleDropdown("idOrderDropdown");
        contactUsPage.FindElementAndHandleDropdown("productDropdown");
        contactUsPage.findElementAndSendKeysFunction("messageInput" , messageName);
        contactUsPage.findElementAndClickFunctionality("submitMessage");

    }
}
