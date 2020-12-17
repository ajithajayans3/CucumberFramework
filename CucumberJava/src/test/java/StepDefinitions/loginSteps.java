package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User opens the login page");
	}

	@When("user enteres username and password")
	public void user_enteres_username_and_password() {
	    System.out.println("User entered the username and passwprd");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("User clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User is landed into home page");
	}
	
}
