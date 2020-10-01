package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUsPage extends _01_ParentOfPages{


    public ContactUsPage(){
        PageFactory.initElements(DriverClass.getDriver() , this);
    }

    @FindBy(id="id_contact")
    private WebElement subjectHeadingDropdown;

    @FindBy(xpath=" //select[@name='id_order']")
    private WebElement idOrderDropdown;

    @FindBy(css="select[style='display: inline-block;']")
    private WebElement productDropdown;

    @FindBy(id="message")
    private WebElement messageInput;

    @FindBy(id="submitMessage")
    private WebElement submitMessage;

    @FindBy(xpath = "//*[contains(@class,'alert alert-')]")
    private WebElement alert;

    WebElement myElement;

    public void FindElementAndHandleDropdown(String elementName){

        switch (elementName){

            case "subjectHeadingDropdown":
                myElement = subjectHeadingDropdown;
                break;
            case "idOrderDropdown":
                myElement = idOrderDropdown;
                break;
            case "productDropdown":
                myElement = productDropdown;
                break;

        }

        handleDropdown(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName , String value){

        switch (elementName){

            case "messageInput":
                myElement = messageInput;
                break;

        }

        sendKeysFunctionality(myElement , value );

    }


    public void findElementAndClickFunctionality(String elementName){

        switch (elementName){

            case "submitMessage":
                myElement = submitMessage;
                break;

        }

        clickFunction(myElement);
    }

    public void handleAlerts(String whichMessage){

        Assert.assertTrue(alert.getText().contains(whichMessage));

    }

//    uniform-id_contact != id_contact
//      find by id is checking is there any element equal to id_contact


}
