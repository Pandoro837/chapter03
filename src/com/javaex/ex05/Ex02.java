package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(",efg ");

		//a와 b의 문자열을 더해 새로운 문자열을 만든다
		System.out.println(a.concat(b));
		//결과는 a+b와 같다
		System.out.println(a+b);
		System.out.println(a);
		System.out.println(b);
		
		a = a.concat(b);	
		System.out.println(a);
		System.out.println("---------------------");	
		
		// a 내부의 공백을 제거해준다
		a = a.trim();
		System.out.println(a);
		System.out.println("---------------------");
		
		// 특정 문자(문자열) old을 
		//지정한 문자(문자열) new로 교체한다 
		a = a.replace("ab", "12");
		System.out.println(a);
		System.out.println("---------------------");
		
		// 지정된 문자(문자열)로 문자열을 쪼개 배열로 만들어준다 
		//이때, 지정된 문자(문자열)은 사라진다
		String[] sArray = a.split(",");
		
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println("---------------------");
		
		//지정된 위치(인덱스)의 문자를 출력한다
		String str = "Hello java!";
		System.out.println(str.charAt(6));
		
		System.out.println("---------------------");
		
		//지정된 위치(인덱스)부터 문자열의 끝까지 출력한다
		String result = str.substring(3);
		System.out.println(result);
		
		//지정된 두개의 수를 기준으로 해당 범위의 문자열을 출력한다
		String result2 = str.substring(3 + 6);
		System.out.println(result);
		
		
		
	}

}
