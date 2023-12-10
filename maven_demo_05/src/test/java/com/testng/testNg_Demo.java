package com.testng;

import org.testng.annotations.Test;

public class testNg_Demo {
	
	@Test(groups="login")
	public void login(){
		System.out.println("login");	
	}
			

	@Test(groups="regration")
	public void dash(){
		System.out.println("dash");	
	}

	@Test(groups="login")
	public void user(){
		System.out.println("user");	
	}

	@Test(groups="regration")
	public void logout(){
		System.out.println("logout");	
		
		
	}
	
	
	
	

}
