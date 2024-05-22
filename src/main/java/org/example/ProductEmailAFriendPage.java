package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriendPage extends Utils{

    private By _TypeFriendemail = By.xpath("//input[@id='FriendEmail']");

    private By _TypeYourEmail = By.id("YourEmailAddress");

    private By _PersonalMessage = By.id("PersonalMessage");

    private By _clickOnSENDEMAIl = By.xpath("//button[normalize-space()='Send email']");

    //to entre Friend's email
    public void toReferAFriend() {
        typeText(_TypeFriendemail,loadProp.getProperty("FriendEmailId"));}

    //to enter Your email address
    public void enterMyEmail(){
        typeText(_TypeYourEmail, "bp"+randomDate()+"@gmail.com");}


    //to enter Personal message
    public void enterPersonalMsg(){
        typeText(_PersonalMessage, "Hi I Found this camera on very good price.");}

        //to click on SEND EMAIl button
    public void toClickOnSENDEMAIlButton(){
        clickOnElement(_clickOnSENDEMAIl);

    }
}
