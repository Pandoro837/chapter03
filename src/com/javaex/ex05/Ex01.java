package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		
		System.out.println(s01 == s02);
		System.out.println(s01.equals(s02));

		String s03 = "hello";
		String s04 = "hello";
		
		System.out.println(s03 == s04);
		
		s03 = "hello!!";
		
		System.out.println(s03);
		System.out.println(s04);

		System.out.println(s03 == s04);
		System.out.println(s03.equals(s04));

		String s05 = "abc";
		
		
//		String s03 = "hi";
//		String s04 = "hi";
//		System.out.println(s01 == s03); //false
//		System.out.println(s01.equals(s03)); //true
//		System.out.println(s03 == s04); //true
//		System.out.println(s03.equals(s04)); //true
		
	}

}
