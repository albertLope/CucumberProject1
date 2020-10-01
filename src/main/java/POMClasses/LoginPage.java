package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends _01_ParentOfPages{

    private WebDriver driver;

    public LoginPage(){

        driver = DriverClass.getDriver();

        PageFactory.initElements(driver, this);
//        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(partialLinkText = "Sign in")
    private WebElement SignInButton;

    @FindBy(id = "email")
    private WebElement EmailInput;

    @FindBy(id = "passwd")
    private WebElement PasswordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement SubmitLoginSignInButton;

    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName){

        switch (elementName){

            case "SignInButton":
                myElement = SignInButton;
                break;
            case "SubmitLoginSignInButton":
                myElement = SubmitLoginSignInButton;
                break;

        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName , String value){

        switch (elementName){

            case "EmailInput":
                myElement = EmailInput;
                break;
            case "PasswordInput":
                myElement = PasswordInput;
                break;

        }

        sendKeysFunctionality(myElement , value );

    }




}
