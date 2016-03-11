package com.saumya.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerimeterTest {

	@Test
	public void test()  {
		Rectangle re=new Rectangle();
		int result=re.perimeter(10, 20);
		assertEquals(200, result);
		System.out.println("perimeter test executes");
	}

}
