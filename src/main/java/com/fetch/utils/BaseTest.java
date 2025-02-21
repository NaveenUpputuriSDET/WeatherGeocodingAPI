package com.fetch.utils;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BaseTest {

    // Create a Logger with class name GFG
    Logger logger
            = Logger.getLogger(BaseTest.class.getName());

    @BeforeSuite
    public void setupReport() {
        ExtentReportManager.getInstance();
    }

    @BeforeMethod
    public void startTestReport(java.lang.reflect.Method method) {
        String testName = method.getName();
        logger.info("Starting test: " + testName);
        ExtentReportManager.startTest(testName);
    }

    @AfterMethod
    public void endTestReport() {
        ExtentReportManager.endTest();
    }
}
