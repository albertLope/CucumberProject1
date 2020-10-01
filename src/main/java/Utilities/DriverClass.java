package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

    /*

        Do we really need TestNG here? where do we use it with cucumber, because on each class we are importing selenium or cucumber classes.



        Question: this driver class is not specific to cucumber. we could have used it when we were using TestNG before, right?

               Yes we had a one class and using the driver in the specific class and every class in the testNG has
                their own driver. But in this framework we have one driver and every classes are using the same driver.
                This pattern(design) calling as a singleton pattern.

                Interview do you know what is singleton?
                    Yes I know singleton, currently in my project. My driver is singelton driver so it is easy to
                        reach in any classes. I am making my driver as static so this is how I reach it.

     */

    private static WebDriver driver;

    static String browserName = "chrome";

    public static WebDriver getDriver(){
        if(driver==null){

            if(browserName.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
            }else if(browserName.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }

        }

        return driver;
    }

    public static void quitDriver(){

        if(driver!=null){

            driver.quit();
            driver=null;

        }
    }

}
