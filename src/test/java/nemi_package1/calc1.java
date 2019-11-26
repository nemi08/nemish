package nemi_package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class calc1 {
	@Given("I enter 50 in calculator")
	public void I_enter_50_in_the_calculator() {
		System.out.println("I enter 50 in the calculator");
	}
	@And("I press add")
	public void method2() {
		System.out.println("I press add");
	}
	@And("I have entered 50 in calculator")
	public void method3() {
		System.out.println("I have entered 50 in calculator");
	}
	@When("I press equal symbol")
	public void method4() {
		System.out.println("I press equal");
	}
	
	

}
