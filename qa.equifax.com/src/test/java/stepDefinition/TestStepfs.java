package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TestStepfs {

	// Given start the script

	@Given("^start the script$")

	public void start_the_script() {

		
		System.out.println("script execution started");

	}

	// Then script execution in progress

	@Then("^script execution in progress$")

	public void script_execution_in_progress() {

		

		System.out.println("script execution in progress");

	}

	// And Execution completed

	@And("^Execution completed$")

	public void Executioncompleted() {

		
		System.out.println("Execution completed");

	}

}
