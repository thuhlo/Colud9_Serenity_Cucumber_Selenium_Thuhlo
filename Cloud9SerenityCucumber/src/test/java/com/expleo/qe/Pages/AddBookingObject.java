package com.expleo.qe.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddBookingObject extends PageObject
{
    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/ul/li[1]/a")
    private WebElement navBookflight;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/h2/center")
    private WebElement lblSuccess;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/h1")
    private WebElement lblBookingPage;

    //@FindBy(how = How.ID, using = "Origin")
    private WebElement Origin;

    private WebElement Destination;

    private WebElement seat;

    private WebElement Flightclass;

    private WebElement submitbutton;

    public AddBookingObject(WebDriver objDriver)
    {
        PageFactory.initElements(objDriver,this);
    }

    public void selectOrigin(String city)
    {

        Select startFrom = new Select(Origin);
        startFrom.selectByVisibleText(city);
    }

    public void selectDEstination(String city)
    {
        Select destination = new Select(Destination);
        destination.selectByVisibleText(city);
    }

    public void chooseSeat(String chooseSeat)
    {
        seat.clear();
        seat.sendKeys(chooseSeat);
    }

    public void chooseClass(String flightClass)
    {
        Select classFly = new Select(Flightclass);
        classFly.selectByVisibleText(flightClass);
    }


    public void navigateToBookiflight()
    {
        navBookflight.click();
    }

    public void clickBook()
    {
        submitbutton.click();
    }

    public void areWeOnBookingPage(String expected)

    {
        Assert.assertEquals(expected,lblBookingPage.getText());
    }

    public void confirmBooking(String expected)
    {
        Assert.assertEquals(expected,lblSuccess.getText());
    }
}
