package com.cl.s2;

import java.util.Scanner;

public class ForTest6 {
	
	public static void main(String [] args) {
		System.out.println("ForTest6 Start");
		//회원가입 시 입력한 ID
		int id = 1234;
		//회원가입 시 입력한 PW
		int pw = 5678;
		
		Scanner sc = new Scanner(System.in);
		//1. 최대 5번 로그인 시도
/*		
		for(int i=0; i<5; i++) {
			
			System.out.println(i+1 + "번째 로그인 시도");
			System.out.println("ID를 입력");
			int yId = sc.nextInt();
			System.out.println("PW를 입력");
			int yPw = sc.nextInt();
			
			if(yId == id && yPw == pw) {
				System.out.println("로그인 성공");
				break;
			}
			
			System.out.println(i+1 + "번째 로그인 실패");
		}//for 끝
*/		
		//2. 
		//for 종료 조건: 로그인 성공 or 5번 모두 실패
		for(int i =0; i<5; i++) {
			System.out.println(i+1 + "번째 로그인 시도");
			System.out.println("ID를 입력");
			int yId = sc.nextInt();
			System.out.println("PW를 입력");
			int yPw = sc.nextInt();
			
			if(yId == id && yPw == pw) {
				System.out.println("로그인 성공");
				break;	
			}
			
			
			if(i<4) {
				System.out.println(i+1 + "번째 로그인 실패");
			}else {
				System.out.println("로그인 실패 은행에 방문");
			}
			
			
		}
	
		
		System.out.println("ForTest6 Finish");
	}

}
