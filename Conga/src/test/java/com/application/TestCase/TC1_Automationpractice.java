package com.application.TestCase;

import org.testng.annotations.Test;

public class TC1_Automationpractice extends BaseClass {
	
	@Test()
	public void moveToprocess() throws InterruptedException {
		page.login();
		page.selectTShrits();
		page.assertion();
		
	}

}
