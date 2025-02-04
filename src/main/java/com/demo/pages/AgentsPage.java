package com.demo.pages;

import com.codeborne.selenide.Selenide;
import com.demo.core.base.PageTools;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AgentsPage extends PageTools {
    private By addNewAgentButton = By.xpath("//button[@title='Add New Agent']");
    private By firstNameField = By.xpath("//input[@name='first_name']");
    private By lastNameField = By.xpath("//input[@name='last_name']");
    private By createButton = By.xpath("//span[text()='Create']");
    private By successfulCreatedNote = By.xpath("//div[text()='Virtual Agent created successfully']");
    private By successfulUpdatedNote = By.xpath("//div[text()='Virtual Agent updated successfully']");
    private By successfulDeletedNote = By.xpath("//div[text()='Agent deleted successfully']");
    private By settingsButton = By.xpath("//tr[td[text()='%s'] and td[text()='%s']]//span[contains(@class, 'anticon-setting')]");
    private By updateOption = By.xpath("//li[text()='Update']");
    private By deleteOption = By.xpath("//li[text()='Delete']");
    private By updateButton = By. xpath("//span[text()='Update']");


    @Step("Check if created")
    public boolean checkIfCreated(){
        waitForElementVisibility(successfulCreatedNote);
        return isElementVisible(successfulCreatedNote);
    }


    @Step("Check if deleted")
    public boolean checkIfDeleted(){
        waitForElementVisibility(successfulDeletedNote);
        return isElementVisible(successfulDeletedNote);
    }

    @Step("Check if updated")
    public boolean checkIfUpdated(){
        waitForElementVisibility(successfulUpdatedNote);
        return isElementVisible(successfulUpdatedNote);
    }


    @Step("Click on add new agent button")
    public void clickAddNewAgentButton(){
        click(addNewAgentButton);
    }

    @Step("Type first name")
    public void typeFirstName(String value){
        type(value, firstNameField);
    }

    @Step("Type last name")
    public void typeLastName(String value){
        type(value, lastNameField);
    }

    @Step("Click create")
    public void clickCreateButton(){
        click(createButton);
    }

    @Step("Click settings button")
    public void clickSettingsButton(String firstName, String lastName){
        click(settingsButton, firstName, lastName);
    }

    @Step("click update option")
    public void clickUpdateOption(){
        click(updateOption);
    }

    @Step("Click delete option")
    public void clickDeleteOption(){
        click(deleteOption);
    }

    @Step("Click update button")
    public void clickUpdateButton(){
        click(updateButton);
    }


}
