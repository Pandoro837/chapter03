package com.javaex.ex03;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle r01 = new Rectangle(6, 4);
		Rectangle r02 = new Rectangle(6, 4 );
		Rectangle r03 = new Rectangle(12, 2);
	
		System.out.println(r01.equals(r02));
		System.out.println(r02.equals(r03));
		System.out.println(r03.equals(r01));
		
	}

}
