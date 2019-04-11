Feature: Cloud9 Airlines

  Scenario: Cloud9 Airlines - Valid Login
    Given That I am on the Cloud9 home page
    When Log in with a valid user id and password
    Then I will be taken to the itinerary page


  Scenario: Cloud9 Airlines - Add a booking
    Given That I am on the Cloud9 home page
    When Log in with a valid user id and password
    Given I navigate to the booking page
    When I add a valid booking
    Then My booking is successful
