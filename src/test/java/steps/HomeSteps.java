package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {

        @Given("^I am navigated to EDreams$")
        public void navigateToEDreams(){
            System.out.println("Navigate to Edreams site");
        }

        @When("^I choose hotel booking tab$")
         public void chooseHotelBooking(){
            System.out.println(" i choose the hotel booking tab");
    }

         @And("^I provide hotel booking information$")
        public void filldetails(){
             System.out.println("I Fill the information needed");
    }
}
