package com.abc.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {

public static ExtentReports reporter ; 
	

	public void genearateReport() { 
		
		reporter =new ExtentReports();
		
		ExtentSparkReporter spark= new ExtentSparkReporter("./Result1/result.html");
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Facebook");
		spark.config().setReportName("Harshal");
		
		reporter.attachReporter(spark);
	}
	
}
