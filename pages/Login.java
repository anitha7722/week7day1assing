package pages;

import org.openqa.selenium.By;

import hooks.TestNghooks;
import io.cucumber.java.en.And;


public class Login extends TestNghooks {
	@And("Type username as {string}")
	public Login typeuserName(String userdata) {
		type(locateElement("id","username"),userdata);
	return this;
	} 
	@And("Type password as {string}")
	public Login typepassword(String passdata) {
		type(locateElement("id","password"),passdata);
		return this;
		} 
	@And("Click Login Button")
	public Home clicklogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new Home();
}
}
