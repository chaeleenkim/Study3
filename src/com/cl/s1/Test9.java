package com.cl.s1;

public class Test9 {
	
	public static void main(String [] args) {
		System.out.println("Test9 Start");
		boolean check = true;
			
		check = !check; //check = false
		
		//!check = true
		if(!check) {
			System.out.println("Test");
		}
		
		//false, check값이 바뀌지 않음
		System.out.println(check);
		
		
		
		//삼항 연산자
		int age = 30;
		// 조건식? true일 때 실행 : false일 때 실행
		String result = age > 19 ? "성년": "미성년";
		System.out.println("Result : "+result);
		
		System.out.println("Test9 Finish");
	}

}
