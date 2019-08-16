package com.maven.TestCases;

import org.testng.annotations.Test;

import com.maven.Base.TestBase;
import com.maven.PageObjects.LoginPage;

public class Test1 extends TestBase{


	@Test
	public  void demo()
	{
		LoginPage.LoginApplication();
	}
	
}
