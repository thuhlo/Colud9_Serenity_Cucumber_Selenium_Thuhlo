package com.expleo.qe.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://performance-testing.co.za/Main/login.html")
public class LoginPageObject extends PageObject
{

    private WebElement inputEmail;
    private WebElement inputPassword;
    private WebElement SigninButton;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/h1")
    private WebElement lblPageName;

    public void openTheBrowser() throws InterruptedException
    {
        open();
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(5000);
    }

    public void enterEmail(String email)
    {
        inputEmail.clear();
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }

    public void clickSignInButton()
    {
        SigninButton.click();
    }

    public void assertItenarary(String ex)
    {
        //TODO Refactor Xpath
        //TODO make aasert more generic
        Assert.assertEquals("Should be on Itinerary page","Itinerary", lblPageName.getText());
    }
}
