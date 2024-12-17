package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginSteps {
    @And("I enter {string}, {string} and login")

    public void iEnterAndLogin(String email, String password) {
        new MyAccountPage().fillLoginData(email, password);
    }

    @Then("Verify text afcter login {string}")
    public void verifyTextAfterLogin(String text) {
        Assert.assertEquals(new MyAccountPage().getAfterLoginHeading(), text, "My Account");


    }
}
