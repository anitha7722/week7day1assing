package pages;

import hooks.TestNghooks;
import io.cucumber.java.en.And;

public class MyHome extends TestNghooks{


	@And("Click Create Leads") 
	public Createleads clickCreateLead() {
	click(locateElement("link", "Create Lead"));
	return new Createleads();
	}
}
