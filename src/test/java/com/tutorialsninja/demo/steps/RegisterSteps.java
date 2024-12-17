package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class RegisterSteps {
    @Then("Verify the text {string}")
    public void verifyTheText(String heading) {
        Assert.assertEquals(new MyAccountPage().verifyMyAccount(),heading,"Invalid heading");
    }

    @Then("Verify the login text {string}")
    public void verifyTheLoginText(String verifyText) {
        Assert.assertEquals(new MyAccountPage().getRegAccHeading(), verifyText, "Register page navigation failed");
    }

    @And("I register to ac using data: {string}, {string}, {string}, {string}, {string}, {string}")
    public void iRegisterToAcUsingData(String firstName, String lastNAme, String email, String mobile, String password, String conformPassword) {
      new MyAccountPage().fillRegistrationData(firstName,lastNAme,email,mobile,password,conformPassword);
    }

    @Then("Verify the Message Your Account Has Been Created!")
    public void verifyTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new MyAccountPage().verifyConformMessage(), "Your Account Has Been Created!", "Reg success msg not displayed");
    }

    @And("I click on continue button after register")
    public void iClickOnContinueButtonAfterRegister() {
        new MyAccountPage().clickOnContAfterRegButton();
    }
}
