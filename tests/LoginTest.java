package tests;

import org.testng.annotations.Test;

import hooks.TestNghooks;
import pages.Login;

public class LoginTest extends TestNghooks {
	@Test(dataProvider = "FetchExcelData")
	public void LoginTest(String Userdata, String Passdata,String CompanyName, String FirstName,String LastName) {
		new Login()
		.typeuserName(Userdata)
		.typepassword(Passdata)
		.clicklogin()
		.clickCRMSFA()
		.clickCreateLead()
		.enterCompanyName(CompanyName)
		.enterFirstName(FirstName)
		.enterLastName(LastName)
		.clickSubmit()
		.verifyLeadIsCreated();
}
}
