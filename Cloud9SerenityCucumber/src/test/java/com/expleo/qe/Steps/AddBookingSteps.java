package com.expleo.qe.Steps;

import com.expleo.qe.Pages.AddBookingObject;
import net.thucydides.core.annotations.Step;

public class AddBookingSteps
{
    AddBookingObject addBookingObject;

    //TODO as below
    @Step
    public void addBooking(String origin, String destination, String seat, String flightClass, String expected)
    {
        addBookingObject.selectOrigin(origin);
        addBookingObject.selectDEstination(destination);
        addBookingObject.chooseSeat(seat);
        addBookingObject.chooseClass(flightClass);
        addBookingObject.clickBook();
        addBookingObject.confirmBooking(expected);
    }


    @Step("Are we on the booking page Expected: {0}")
    public void confrimPage(String expected)
    {
        addBookingObject.confirmBooking(expected);
    }
}
