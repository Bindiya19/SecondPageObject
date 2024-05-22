package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NopcommerceNewRelease extends Utils {
    private By _typeTitle = By.id("AddNewComment_CommentTitle");

    private By _typeComment = By.id("AddNewComment_CommentText");

    private By _clickOnNEWCOMMENT = By.name("add-comment");

    private By _clickOnMsgNEWCOMMENT = By.className("result");

    private By _commentsContainer = By.className("comment-list");

    private By _FindLastComment = By.xpath("//div[@class='comment-list']/div[2]/div[4]");

    private By _newLastComment = By.xpath("//div[@class='comment-list']/div[2]/div[4]");


    public void enterYourTitleAndComment() {
        //type title in Title box
        typeText(_typeTitle, "john");
        //type comment in Comment box
        typeText(_typeComment, "HELLO"+randomDate());
        //click on NEW COMMENT
        clickOnElement(_clickOnNEWCOMMENT);
    }

    public void verifyAndCompereMsg(){

        //actual text msg after click on NEW COMMENT
        String actualMsg = getTextFromElement(_clickOnMsgNEWCOMMENT);
        //text msg as requirement
        String expectedMsg = loadProp.getProperty("ExpectedMsg");
        //comparing actual and expected
        Assert.assertEquals(actualMsg, expectedMsg, "Wrong massage display");
    }

    public void myCommentShowInListAtLast(){
        // Locate the container or element that holds all the comments
        WebElement commentsContainer = driver.findElement(_commentsContainer);
        // Find the last comment element within the container
        WebElement lastComment = commentsContainer.findElement(_FindLastComment);
        //to Store last Comment
        String lastCommentText = lastComment.getText();
        // Add a new comment (code to add a new comment goes here)
        //locate the last comment after adding the new comment
        WebElement newLastComment = commentsContainer.findElement(_newLastComment);
        //Storing new last comment
        String newLastCommentText = newLastComment.getText();
        // Compare the text or content of the last comment before and after adding the new comment
        if (lastCommentText.equals(newLastCommentText)) {
            System.out.println("New comment is shown at the last position.");
        } else {
            System.out.println("New comment is not shown at the last position.");
        }
    }
}
