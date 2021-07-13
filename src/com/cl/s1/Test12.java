package com.cl.s1;

public class Test12 {
	
	public static void main(String [] args) {
		System.out.println("Test12 Start");
		
		int num = 1;
		
		switch(num) {
		case 1:
			System.out.println("case 1");
			break;
		default :
			System.out.println("그외 나머지");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 4:
			System.out.println("case 3");
			break;
		
		}
		
		//break를 만나거나 switch문의 끝을 만나야 끝난다
		//default의 위치를 바꿀 수 있다
		
		System.out.println("Test12 Finish");
	}

}
