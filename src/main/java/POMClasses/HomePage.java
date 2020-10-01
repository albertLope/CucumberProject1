package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends _01_ParentOfPages{

    public HomePage(){
        PageFactory.initElements(DriverClass.getDriver() , this);
    }

    @FindBy(partialLinkText = "Contact us")
    private WebElement ContactUsButton;

    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName){

        switch (elementName){

            case "ContactUsButton":
                myElement = ContactUsButton;
                break;

        }

        clickFunction(myElement);

    }
}
