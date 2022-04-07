package com.quantum.steps;

import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.quantum.pages.WikipediaPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.net.MalformedURLException;

@QAFTestStepProvider
public class WikipediaStepDefs {
    @Given("Click on Search box")
    public void clickOnSearchBox() throws MalformedURLException, InterruptedException { new WikipediaPage().click_on_search_box();}

    @When("BrowserStack is searched")
    public void sendSearchText() { new WikipediaPage().is_searched("BrowserStack");}
}
