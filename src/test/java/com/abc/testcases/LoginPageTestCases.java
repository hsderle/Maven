package com.abc.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter.*;
import org.testng.annotations.BeforeClass;

import com.abc.LoginPage.Homepage;
import com.abc.LoginPage.LoginPage;
import com.abc.Reports.*;
import com.abc.comonfunctionality.Browser;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class LoginPageTestCases {
	
	@BeforeClass
	public void generatereport() throws InterruptedException {
		Reporter reporter =new Reporter();
		reporter.genearateReport();
		Browser browser =new Browser();
		browser.BrowserLaunch();
	}
	
	@Test(description="Verify that user should be able to login with valid data",priority=1) 
	public void TC1() throws InterruptedException{
	
    ExtentTest extenttest = Reporter.reporter.createTest("Verify that user should be able to login with valid data")	;
	LoginPage LoginPage = new LoginPage ();
	LoginPage.LoginFunctionality("7350945841", "7350945841");
	//validation
	
	Thread.sleep(2000);
	
	Homepage homePage=new Homepage();
	if(homePage.getGamingLink().isDisplayed()) {
		extenttest.log(Status.PASS, "User is able to Login");
	} 
	else {
		extenttest.log(Status.FAIL, "User is unable to Login");
	}
	
	}
	@Test(description="Verify that user should be able to login with invalid data",priority=0)
	public void TC2() throws InterruptedException {
		
	Reporter.reporter.createTest("Verify that user should be able to login with invalid data")	;
	LoginPage LoginPage = new LoginPage ();
	LoginPage.LoginFunctionality("7350945841", "12345678");	
	Thread.sleep(5000);

	}
	
	@AfterClass
	public void postcondition(){
		Reporter.reporter.flush();
	}
	
}
