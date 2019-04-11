package com.expleo.qe.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavigationPageObject extends PageObject
{
    @FindBy(how = How.LINK_TEXT, using = "Logout")
    private WebElement logoutLink;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/ul/li[1]/a")
    private WebElement navBookflight;


    public void navigateToBookFlight()
    {
        navBookflight.click();
    }
    public void clickLogout()
    {
        logoutLink.click();
    }


}
