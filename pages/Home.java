package pages;

import hooks.TestNghooks;
import io.cucumber.java.en.And;

public class Home  extends TestNghooks{
	
		@And("Click CRMSFA") 
		public MyHome clickCRMSFA() {
		click(locateElement("link", "CRM/SFA"));
		return new MyHome();
		}
}
