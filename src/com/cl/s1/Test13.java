package com.cl.s1;

import java.util.Scanner;

public class Test13 {
	
	
	public static void main(String [] args) {
		System.out.println("Test13 Start");
		
		//요금조회는 1번
		//상품가입은 2번
		//고장신고는 3번
		//상담원연결 0번
		//잘못 누름 다시 선택
		
		Scanner sc = new Scanner(System.in);
		System.out.println("요금조회는 1번");
		System.out.println("상품가입은 2번");
		System.out.println("고장신고는 3번");
		System.out.println("상담원연결 0번");
		
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("요금조회 선택");
			break;
		case 2:
			System.out.println("상품가입 선택");
			break;
		case 3:
			System.out.println("고장신고 선택");
			break;
		case 0:
			System.out.println("상담원연결 선택");
			break;
		default :
			int num = 10;
			System.out.println("잘못 선택");
			break;
		}
		
		
		if(select > 0) {
			int num2 = 20;
		}
		
		
		//System.out.println(num2);
		System.out.println(select);
		//System.out.println(num);
		
		System.out.println("Test13 Finish");
	}

}
