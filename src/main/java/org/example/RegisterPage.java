package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    private By _clickFemaleRadioButton = By.id("gender-female");

    private By _typeFirstname = By.id("FirstName");

    private By _typeLastname = By.id("LastName");

    private By _selectDateOfBirth = By.name("DateOfBirthDay");

    private By _selectDateOfBirthMonth = By.name("DateOfBirthMonth");

    private By _selectDateOfBirthYear = By.name("DateOfBirthYear");

    private By _TypeYourEmail = By.id("Email");

    private By _TypePassword = By.id("Password");

    private By _clickConformPassword = By.id("ConfirmPassword");

    private By _clickSubmitRegister = By.name("register-button");


    // this method for registration
    public void enterRegistrationDetails(){

        //to click on Female radio button
        clickOnElement(_clickFemaleRadioButton);

        //type firstname
        typeText(_typeFirstname,email);

        //type lastname
        typeText(_typeLastname,loadProp.getProperty("LastName"));

        //to select Date of birth
        selectTextByVisibleText(_selectDateOfBirth,"19");

        //to select Date of birth Month
        selectTextByVisibleText(_selectDateOfBirthMonth,"May");

        //to select Date of birth Year
        selectTextByVisibleText(_selectDateOfBirthYear,"1985");

        //enter your email
        typeText(_TypeYourEmail,email);

        //enter your password
        typeText(_TypePassword,password);

        //enter your Conform password
        typeText(_clickConformPassword,loadProp.getProperty("ConfirmPassword"));

        //click on submit register button
        clickOnElement(_clickSubmitRegister);


    }
}
