package Utils.ExtentReport;

import Utils.ConfigReader;
import Utils.ConstantsUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.Platform;

import java.io.File;
import java.sql.Timestamp;

public class ExtentManager {

    private static ExtentReports extent;
    private static Platform platform;
    private static Timestamp tstamp = new Timestamp(System.currentTimeMillis());
    private static String reportFilename = "Test_Automation_Report_" +
            ConfigReader.BROWSER + "_" +
            tstamp.getTime()+ ".html";
    private static  String windowsPath = System.getProperty("user.dir")+"\\TestReport";
    private static String winReportFIleLocation = windowsPath + "\\" + reportFilename;

    private static ExtentReports getInstance(){
        if (extent == null){
            return createInstance();
        }
        return  extent;
    }

    static ExtentReports createInstance(){
        String fileName = getReportLocation();
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().getChartVisibilityOnOpen();
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }

    private static String getReportLocation() {
        String reportLocation = null;
        reportLocation = winReportFIleLocation;
        crateReportPath(windowsPath);
        System.out.println("Report location" + windowsPath);
        return reportLocation;
    }

    private static void crateReportPath(String windowsPath) {
        File dir = new File(windowsPath);
        if (!dir.exists()){
            if(dir.mkdir()){
                System.out.println("Folder was create successfully for the report !");
            }
            else{
                System.out.println("Fail to create folder for report");
            }
        }
        else {
            System.out.println("The folder already exists on the disk");
        }
    }
}
