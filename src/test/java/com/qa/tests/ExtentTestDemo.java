package com.qa.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.utilities.ExtentManager;

public class ExtentTestDemo {

    @Test
    public void reportTest() {

        ExtentReports extent =
                ExtentManager.getReport();

        ExtentTest test =
                extent.createTest("Google Test");

        test.pass("Application launched");

        extent.flush();
    }
}