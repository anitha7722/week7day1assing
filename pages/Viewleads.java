package pages;

import org.openqa.selenium.WebElement;

import hooks.TestNghooks;
import io.cucumber.java.en.Then;

public class Viewleads extends TestNghooks{
	@Then("Verify New lead is created") 
	public void verifyLeadIsCreated() {


	WebElement ele = locateElement("id", "viewLead_companyName_sp");
	if(ele.isDisplayed())
	{ 
	System.out.println("Lead is created"); 
	}  
	else {
    System.out.println("Lead is not created"); 
}
	}
}
