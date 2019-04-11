package com.expleo.qe.Steps;

import com.expleo.qe.Pages.NavigationPageObject;
import net.thucydides.core.annotations.Step;

public class NavigationSteps
{
    NavigationPageObject navigationPageObject;

    @Step("Now we logout")
    public void clickLogOut()
    {
        navigationPageObject.clickLogout();
    }

    @Step("Navigate to Book flight")
    public void navigateToFlight()
    {
        navigationPageObject.navigateToBookFlight();
    }
}
