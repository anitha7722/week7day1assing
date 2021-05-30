package pages;


	import org.openqa.selenium.By;

import hooks.TestNghooks;
import io.cucumber.java.en.And;

	
	public class Createleads extends TestNghooks {
				  @And("Enter Company Name as (.*)$") 
				  public Createleads enterCompanyName(String CompanyName) {
				  type(locateElement("id", "createLeadForm_companyName"), CompanyName);
				  return this;
				  }

				  @And("Enter First Name as (.*)$") 
				  public Createleads enterFirstName(String FirstName) {
				  type(locateElement("id", "createLeadForm_firstName"), FirstName);
				  return this;
				  }

				  @And("Enter Last Name as (.*)$") 
				  public Createleads enterLastName(String LastName) {
				  type(locateElement("id", "createLeadForm_lastName"), LastName);
				  return this;
				  }

				  @And("Click Submit") 
				  public Viewleads clickSubmit() {
				  driver.findElement(By.name("submitButton")).click();
				  click(locateElement("name", "submitButton"));
				  return new Viewleads();
				  } 

}
