package com.expleo.qe.Steps;

import com.expleo.qe.Pages.LoginPageObject;
import net.thucydides.core.annotations.Step;

public class LoginSteps
{
    LoginPageObject loginPage;

    @Step("Open the browser")
    public void openBrowser() throws InterruptedException
    {
        //loginPage.open();
        loginPage.openTheBrowser();
    }

    @Step("Capture email: {0} password: {1} login details")
    public void LoginDetails(String email, String password) throws InterruptedException
    {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        Thread.sleep(5000);
        loginPage.clickSignInButton();

    }

    @Step("Confirm that we are on the itinerary page")
    public void confirmItenararyPage()
    {
        loginPage.assertItenarary("ex");
    }
}
