package com.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions{
	
	@Then("i pass {int} to the stepdef")
	public void i_pass_to_the_stepdef(Integer int1) {
		System.out.println("-----------i_pass_to_the_stepdef------------------");		
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("-----------i_want_to_write_a_step_with_precondition------------------");
	}
	
	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("-----------some_other_precondition------------------");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("-----------i_complete_action------------------");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("-----------some_other_action------------------");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("-----------yet_another_action------------------");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	  //assertEquals(1, 2);
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("-----------check_more_outcomes------------------");
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("-----------user_is_on_home_page------------------");
	}
	
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		System.out.println("-----------user_navigate_to_log_in_page------------------");
	}
	
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable dataTable) {
		System.out.println(dataTable.asList());
		System.out.println(dataTable.asMaps());
	}
	
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("-----------message_displayed_login_successfully------------------");
	}

	@When("User enters {string} as user name")
	public void user_enters_as_user_name(String string) {
		System.out.println("-----------user_enters_as_user_name------------------");
	}
	
	@When("User enters {string} as password")
	public void user_enters_as_password(String string) {
		System.out.println("-----------user_enters_as_password------------------");
	}
	
	@Then("login should be successfull")
	public void login_should_be_successfull() {
		System.out.println("-----------login_should_be_successfull------------------");
	}

	@When("i apply leave")
	public void i_apply_leave() {
		System.out.println("-----------i_apply_leave------------------");
	}

	@Then("leave should be applied")
	public void leave_should_be_applied() {
		System.out.println("-----------leave_should_be_applied------------------");
	}

	@When("i cancel leave")
	public void i_cancel_leave() {
		System.out.println("-----------i_cancel_leave------------------");
	}

	@Then("leave should be cancelled")
	public void leave_should_be_cancelled() {
		System.out.println("-----------leave_should_be_cancelled------------------");
	}
	
	@When("i approve any leave")
	public void i_approve_any_leave(String docString) {
		System.out.println("------------------------");
		System.out.println(docString);
		System.out.println("------------------------");
	}

	@Then("leave should be approved")
	public void leave_should_be_approved() {
		System.out.println("-----------leave_should_be_approved------------------");
	}
	
}
