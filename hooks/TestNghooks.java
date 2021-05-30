package hooks;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.cucumber.messages.internal.com.google.common.base.Objects;
import utils.ReadExceldata;
import wrappers.BaseDriver;

public class TestNghooks extends BaseDriver {

	@BeforeSuite
	public void init(){
		//Start reporting
	}
	@BeforeTest
	public void setup(){
		//lets do it later
	}
	@BeforeClass
	public void beforclass(){
		//lets do it later
	}
	@BeforeMethod
	public void invoke(){
		//Start application
		startApp("chrome","http://leaftaps.com/opentaps");
	}
	@AfterMethod
	public void close(){
		//close driver
		closeActiveBrowser();
	}
	
	@AfterClass
	public void aftclass(){
		//Start reporting
	}
	@AfterTest
	public void test(){
		//Start reporting
	}
	@AfterSuite
	public void initi(){
		//Start reporting
	}
	
	@DataProvider(name="FetchExcelData")
	public Object[][] readExcelData() throws InvalidFormatException, IOException{
		try {
			return ReadExceldata.readExcel("Create Lead");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("");
		}
		return null;
	}
	
}

