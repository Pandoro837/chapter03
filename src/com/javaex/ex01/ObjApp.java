package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
	
		Object obj01 = new Object();

		

//		getClass() - > 클래스의 정보를 출력
		System.out.println("obj01.getClass()======================");
		System.out.println(obj01.getClass());
		System.out.println("======================================");
		
//		hashCode() - > 주소값 - > 주소에 대응되는 중복되지 않는 값
//		(실제 주소가 아니나, 중복되지 않으므로 주소처럼 생각할 수 있다)
		System.out.println("obj01.hashCode()======================");
//		System.out.println(obj01.hashCode());
		Object o01 = new Object();
		Object o02 = new Object();
		Object o03 = new Object();
		System.out.println(o01.hashCode());
		System.out.println(o02.hashCode());
		System.out.println(o03.hashCode());
		System.out.println("======================================");
		
//		toString() - > 객체의 값(필드) 정보
		System.out.println("obj01.toString()======================");
		System.out.println(obj01.toString());
		System.out.println("======================================");
		
//		equals() - > 객체가 같은지 비교
		System.out.println("obj01.equals()========================");
		System.out.println(obj01.equals(obj01));
		System.out.println("======================================");
		
	}
	
	
}
