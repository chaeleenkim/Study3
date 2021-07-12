package com.cl.s1;

public class Test7 {
	
	public static void main(String [] args) {
		System.out.println("Test7 Start");
		boolean check = true;
		
		//check가 boolean이므로 조건식 가능, check == true 쓸 필요 없다
		if(check) {
			System.out.println("조건식이 true");
		}
		
		check = false;
		if(check) {
			System.out.println("조건식2222가 true");
		}
		
		System.out.println("Test7 Finish");

	}

}
