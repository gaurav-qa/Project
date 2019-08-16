package com.maven.initialization;

import org.testng.annotations.BeforeClass;

import com.maven.PageObjects.LoginPage;


public class Inilialize {
	
	@BeforeClass
	public void test(){
	
	new LoginPage();
	}
}
