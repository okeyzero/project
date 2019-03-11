package edu.zut.cs.software.sun.admin.service;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;

import org.junit.Test;

public class UserManagerTest {

	@Test
	public void testSayHello() {
		String expected = "Hello,world";
		String result = this.UserManager.sayHello("world");
		assertEquals(expected,result);
	}

}
