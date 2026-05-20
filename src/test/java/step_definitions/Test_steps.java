package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_steps {
WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   System.out.println("============user_is_on_home_page()================ ");
	   driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details\r\n");
		driver.manage().window().maximize();
		
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		 System.out.println("============user_navigate_to_log_in_page()================ ");
	}

	@When("User enters UserName and Password")
	public void user_enters_user_name_and_password() {
		 System.out.println("============user_enters_user_name_and_password()================ "); 
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		 System.out.println("============message_displayed_login_successfully()================ ");
	}

	



	
	
}
