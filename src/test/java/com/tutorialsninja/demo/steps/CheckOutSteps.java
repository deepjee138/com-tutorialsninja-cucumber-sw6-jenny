package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckOutSteps {

    @Then("Verify {string} heading")
    public void verifyHeading(String verifyHeading) {
        Assert.assertEquals(new CheckoutPage().getNewCustHeading(), verifyHeading, "New customer not displayed");
    }

    @And("I click on guest checkout radio")
    public void iClickOnGuestCheckoutRadio() {
        new CheckoutPage().clickOnGuestRadio();
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("I fill billing form details; {string},{string},{string},{string},{string}, {string}, {string}, {string},{string}")
    public void iFillBillingFormDetails(String firstName, String lastName, String email, String mobile, String address, String city, String postCode, String country, String state) {

        new CheckoutPage().fillBillingFormDetails(firstName,lastName,email,mobile,address,city,postCode,country,state);
    }

    @And("I click on del method continue btn")
    public void iClickOnDelMethodContinueBtn() {
        new CheckoutPage().clickOnDelMethodContButton();
    }

    @And("I click on agree terms checkbox")
    public void iClickOnAgreeTermsCheckbox() {
        new CheckoutPage().clickOnAgreeTermsCheckbox();
    }

    @And("I click on payment method continue btn")
    public void iClickOnPaymentMethodContinueBtn() {
        new CheckoutPage().clickOnPaymentMethodCont();
    }
}
