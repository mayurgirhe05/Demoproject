package com.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.listeners.MyListeners.class)
public class TestNG_Ex {
	@Test
	public void login()throws Exception{
		
	System.out.println("login");
	}
		@Test
		public void dash()throws Exception{
			System.out.println("dash");
			Assert.assertEquals(1, 2);
			
		}
		@Test
		public void user(){
			System.out.println("user");
			throw new SkipException("Skipping Testcase");
			
		}
	
}


