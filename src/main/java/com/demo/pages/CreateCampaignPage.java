package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.utils.Constants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class CreateCampaignPage extends PageTools {
    private By createCampaignButton = By.xpath("//span[text()='Create campaign']");
    private By nameField = By.xpath("//input[@name='name']");
    private By select = By.xpath("//select[@name='type']");
    private By startButton = By.xpath("//span[text()='Start']");
    private By createdCampaign = By.xpath("//span[text()='%s']");

    @Step("Check if created")
    public boolean checkIfCreated(String campaign){
        waitForElementVisibility(createdCampaign, campaign);
        return isElementVisible(createdCampaign, campaign);
    }

    @Step("Create campaign")
    public void createCampaign(){
        click(createCampaignButton);
    }

    @Step("Type name")
    public void typeName(String value){
        type(value, nameField);
    }

    @Step("Select type option")
    public void selectTypeOption(String option){
        selectOption(option ,select);
    }

    @Step("Click start button")
    public void clickStartButton(){
        click(startButton);
    }
}
