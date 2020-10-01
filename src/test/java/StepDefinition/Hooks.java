package StepDefinition;

import Utilities.DriverClass;
import cucumber.api.java.After;

public class Hooks {


    @After
    public void AfterScenario(){

        DriverClass.quitDriver();
    }
}
