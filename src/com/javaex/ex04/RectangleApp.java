package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle r01 = new Rectangle(6, 4);
		Rectangle r02 = new Rectangle(6, 4 );
		Rectangle r03 = new Rectangle(12, 2);
		Rectangle r04 = new Rectangle(3, 8);
		Rectangle r05 = new Rectangle(12, 4);

		System.out.println(r01.equals(r02));
		System.out.println(r02.equals(r03));
		System.out.println(r03.equals(r04));
		System.out.println(r04.equals(r05));
		System.out.println(r05.equals(r01));
		
	}

}
