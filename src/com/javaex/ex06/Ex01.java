package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		
		//int result = 10 + 7;
		//Integer result =  new Integer(10) + new Integer(7);
		Integer result = i01 + i02;
		
		System.out.println(result);
		
		int i10 = 7;
		//i10. int i는 클래스로 선언되지 않았기 때문에, 메소드 호출이 불가능하다
		
		Integer i11 = 10; // == Integeri11 = new Integer(10); int 값을 Integer 클래스로 선언하는 것을
						  // 박싱(boxing)이라고 한다
		
		//i11. Integer i11은 Integer 클래스로 선언된 객체이므로
		//자신과 부모(Object)의 메소드 호출이 가능하다
		
		Integer i100 = 15;
		int i101 = i100;	//기본 자료형에 주소값을 넣었으나, 출력은 int 값이 나온다
							//Wrapper class 에서 참조변수의 클래스와 기본 자료형의 자료형이 같을 경우
							//언박싱(unboxing)이 자동으로 적용되어, 주소값이 아닌 실제 값을 넣어준다
		
		System.out.println(i101);

		System.out.println("문자열 - > 정수 ---------------------");
		
		// "12345" - > 12345	
		Integer i999 = new Integer(999);	//parseInt를 사용하기 위해 쓸데없는 객체를 생성해야한다
		int iNum = i999.parseInt("12345"); //만약 문자열 내부에 문자가 있다면, 에러가 발생한다
		System.out.println(iNum);
	
		//parseInt는 static 메소드이기 때문에, 굳이 이렇게 사용하지 않아도 된다
		int iNum2 = Integer.parseInt("12345");
		System.out.println(iNum2);

		System.out.println("정수 - > 문자열 ---------------------");
		
		// 123456 - > "123456"
		String str = new String("hi");
		String strResult = str.valueOf(123456);
		System.out.println(strResult);
		
		//valueOf 역시 static 메소드이기 때문에, 객체의 선언이 필요하지 않다.
		
		String strResult2 = String.valueOf(123456);
		System.out.println(strResult2);
		
		//	자주 사용하는 방법
		String strResult3 = ""+9876;	//문자열 + 숫자를 연산 할 경우, 숫자를 문자열로 인식한다
		System.out.println(strResult3);
		
		String yn = "y";	//사용자가 입력한 값
		//String yn = new String("y");
		yn=null;
		
		if(yn.equals("y")) {
			System.out.println("다시 시작합니다.");
		}
	
		//yn의 값이 null이거나, 다른 값을 가져 비교가 불가능 할 경우
		//문자열.equals를 통해 사용 할 수 있다
		//"y"는 문자열 상수 풀에 자리를 갖는 객체로서 저장되어 있으므로, 언제든 equals 메소드를
		//사용 할 수 있다.
		if("y".equals(yn)) {
			System.out.println("다시 시작합니다.");
		}
		
		//다른 기본 자료형
//		Byte b = new Byte(1); 1을 int형으로 인식하여 오류가 발생한다
		Byte b = new Byte((byte)1);
		Short s = new Short((short)3);
		
		
	}

}
