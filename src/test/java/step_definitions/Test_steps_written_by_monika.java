package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_steps_written_by_monika {

	
	@When("User Logout from the Application")
	public void user_logout_from_the_application() {
		 System.out.println("============user_logout_from_the_application()================ ");
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_logout_successfully() {
		 System.out.println("============message_displayed_logout_successfully()=============== ");
	}
}
