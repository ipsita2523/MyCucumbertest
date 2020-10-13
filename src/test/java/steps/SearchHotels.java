package steps;

import io.cucumber.java.en.Then;

public class SearchHotels {


        @Then("^I should be able to view list of available hotels$")
        public void searchhotels(){
            System.out.println("list of hotels shold be displayes");
        }
}
