package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener{
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started with name: "+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase passed with name: "+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed with name: "+result.getName());	
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped with name: "+result.getName());	
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {	
	}
	public void onStart(ITestContext context) {	
		System.out.println("Test suite started");
	}
	public void onFinish(ITestContext context) {
		System.out.println("Test suite finished");
	}

}
