package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ApplicationBaeTest.BaseClass;

public class ExtentRepoters extends BaseClass {
	public static ExtentReports genrateExtentReport()   {
		ExtentReports extentReport =new ExtentReports();
		File extentReportFile=new File(System.getProperty("user.dir")+".//test-output/ExtentReports/extentReports.html");
		ExtentHtmlReporter  html=new ExtentHtmlReporter(extentReportFile);
		html.config().setTheme( Theme.DARK);
		html.config().setReportName("Luma Project Test Results");
		html.config().setDocumentTitle("Project Test Results Report");
		html.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		extentReport.attachReporter(html);
		Properties congfigPro=new Properties();
		File configPropFile=new File (System.getProperty("user.dir")+".//src/test/java/config/config.properties");
		
		
		try {
			FileInputStream fis =new FileInputStream(configPropFile);
			
			congfigPro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extentReport.setSystemInfo("Application URL", congfigPro.getProperty("testURL"));
		extentReport.setSystemInfo("Browser Name", congfigPro.getProperty("browser"));
		extentReport.setSystemInfo("Operating System",System.getProperty("os.name"));
		extentReport.setSystemInfo("Operating System",System.getProperty("os.name"));
		extentReport.setSystemInfo("Username",System.getProperty("user.name"));
		extentReport.setSystemInfo("Java Version",System.getProperty("java.version"));
		
		return extentReport;
				
	}
}




