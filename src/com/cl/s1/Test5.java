package com.cl.s1;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String [] args) {
		System.out.println("Test5 Start");
		Scanner sc = new Scanner(System.in);
		
		//회원가입 시 입력한 ID
		int id = 1234;
		//회원가입 시 입력한 PW
		int pw = 5678;
		
		//입력할 id
		int yID=0;
		//입력할 pw
		int yPW=0;
		
		System.out.println("ID를 입력하세요");
		//ID 입력 후 저장
		yID = sc.nextInt();
		
		System.out.println("PW를 입력하세요");
		//PW 입력 후 저장
		yPW = sc.nextInt();
		
		//로그인이 성공하면 - 로그인 성공 출력
		if(yID == id && yPW == pw) {
			System.out.println("로그인 성공");
		}
				
				
		System.out.println("Test5 Finish");
		
	}
	

}
