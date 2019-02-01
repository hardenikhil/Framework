package com.perficient.magento.testcase.login;

import org.testng.annotations.Test;

/**
 * @author pooja.manna
 * Test Runner Class to run test cases
 */


public class TestCaseRunner {
	
  
  public void TC01Valid() throws Exception {
	  TC01MagentoLoginTest tc01 = new TC01MagentoLoginTest();
	  tc01.test01ValidCredential();
  }
  
//  @Test
//  public void TC02Invalid() {
//  }
//  
//  @Test
//  public void f() {
//  }
}
