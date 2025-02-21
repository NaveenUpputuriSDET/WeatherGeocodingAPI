package com.fetch.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportFileName = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date()) + "_TestReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter("reports/" + reportFileName);
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }

    public static void startTest(String testName) {
        test = getInstance().createTest(testName);
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void endTest() {
        getInstance().flush();
    }
}
