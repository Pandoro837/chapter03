package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p03 = p00;
		
//		getClass() 클래스 정보
		System.out.println(".getClass()===========================");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println(p03.getClass());
		System.out.println("======================================");

//		hashCode() 주소에 대응하는 값
		System.out.println(".hashCode()===========================");
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println("======================================");

//		toString() 객체의 정보
		System.out.println(".toString()===========================");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println(p03.toString());
		System.out.println("======================================");

//		equals() 객체가 같은지 비교
		System.out.println(".equals()===========================");
		System.out.println(p00.equals(p01)); //단순히 객체에 든 값이 같다고
		System.out.println(p01.equals(p02)); //true 값이 나오지는 않는다
		System.out.println(p02.equals(p03));
		System.out.println(p03.equals(p00));
		System.out.println("======================================");
		
//		참조변수에 == 연산자를 사용할 경우, 내부의 주소값을 비교한다
		System.out.println(p00 == p01);
//		p03에 p00을 대입하여, p03의 내부 값(주소)가 p00의 내부 값(주소)
//		로 대체되었기 때문에 같다는 결과가 나온다
		System.out.println(p00 == p03);
		
		
		
		
		
	}

}
