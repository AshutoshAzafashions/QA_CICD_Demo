package com.qa.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReport() {

        ExtentSparkReporter spark =
                new ExtentSparkReporter("Reports/ExtentReport.html");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(spark);

        return extent;
    }
}