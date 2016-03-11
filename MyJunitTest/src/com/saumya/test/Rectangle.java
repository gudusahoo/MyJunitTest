package com.saumya.test;

public class Rectangle 
{
	int length;
	int breadth;
	
	
	public   int area(int l,int b)
	{
		length=l;
		breadth=b;
		return length*breadth;
		
	}
	public int perimeter(int l,int b)
	{
		length=l;
		breadth=b;
		return 2*(length+breadth);
	}

	
}
