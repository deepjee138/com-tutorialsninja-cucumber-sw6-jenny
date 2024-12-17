package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNoteBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class LapTopsAndNoteBooksSteps {



    @And("I select Sort By position Price \\(High > Low)")
    public void iSelectSortByPositionPriceHighLow() {
        new LaptopsAndNoteBooksPage().selectFromSortByDropdown("Price (High > Low)");
    }

    @Then("Verify the product arrange in high to low order")
    public void verifyTheProductArrangeInHighToLowOrder() {
        List<Double> expectedList = new LaptopsAndNoteBooksPage().priceHighToLow();
        List<Double> actualList = new LaptopsAndNoteBooksPage().getPriceHighToLow();
        Assert.assertEquals(actualList, expectedList);
    }

    }

