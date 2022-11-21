package utilities.extentreport;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("Address API Test Extent Report");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Platform", "Windows");
        extentReports.setSystemInfo("Browser", "Chrome");
        return extentReports;
    }
}