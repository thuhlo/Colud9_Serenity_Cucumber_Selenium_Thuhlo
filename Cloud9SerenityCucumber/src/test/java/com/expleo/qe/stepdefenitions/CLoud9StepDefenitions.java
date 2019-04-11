package com.expleo.qe.stepdefenitions;

import com.expleo.qe.Steps.AddBookingSteps;
import com.expleo.qe.Steps.LoginSteps;
import com.expleo.qe.Steps.NavigationSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CLoud9StepDefenitions
{

    @Steps
    LoginSteps loginSteps;
    @Steps
    NavigationSteps navigationSteps;

    @Steps
    AddBookingSteps addBookingSteps;

    @Given("^That I am on the Cloud(\\d+) home page$")
    public void that_I_am_on_the_Cloud_home_page(int arg1) throws InterruptedException
    {
        loginSteps.openBrowser();

    }

    @When("^Log in with a valid user id and password$")
    public void log_in_with_a_valid_user_id_and_password() throws InterruptedException
    {
        loginSteps.LoginDetails("tmoabi26@gmail.com","Password");

    }

    @Then("^I will be taken to the itinerary page$")
    public void i_will_be_taken_to_the_itinerary_page()
    {
        loginSteps.confirmItenararyPage();
        navigationSteps.clickLogOut();

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("^I navigate to the booking page$")
    public void i_navigate_to_the_booking_page()
    {
        navigationSteps.navigateToFlight();

    }

    @When("^I add a valid booking$")
    public void i_add_a_valid_booking()
    {

       //TODO Change as follows
       addBookingSteps.addBooking("London", "Johannesburg", "C700", "First",
               "Flight booked successfully");

    }

    @Then("^My booking is successful$")
    public void my_booking_is_successful()
    {
        addBookingSteps.confrimPage("Flight booked successfully");

    }

}
