package com.saumya.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

	@Test
	public void test()  {
		Rectangle re=new Rectangle();
		int result=re.area(20, 30);
		assertEquals(600, result);
		System.out.println("area test executes");
	}

}
