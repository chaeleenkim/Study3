package com.cl.s2;

import java.util.Scanner;

public class ForTest6 {
	
	public static void main(String [] args) {
		System.out.println("ForTest6 Start");
		//회원가입 시 입력한 ID
		int id = 1234;
		//회원가입 시 입력한 PW
		int pw = 5678;
		
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		//1. 최대 5번 로그인 시도
		
		//int i=456; int 변수 재활용 가능
		//for문 안에서 꼭 선언하지 않아도 된다
		for(int i=0; i<5; i++) {
			
			System.out.println(i+1 + "번째 로그인 시도");
			System.out.println("ID를 입력");
			int yId = sc.nextInt();
			System.out.println("PW를 입력");
			int yPw = sc.nextInt();
			
			if(yId == id && yPw == pw) {
				flag = !flag;
				//flag =true;
				break;
			}
			
			System.out.println(i+1 + "번째 로그인 실패");
		}//for 끝
		
		
		//2. 
		//for 종료 조건: 로그인 성공 or 5번 모두 실패
		//flag가 true면 로그인 성공 false면 모두 실패	
		if(flag) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 은행에 방문");
		}
		
		//flag : 신호로 사용하는 변수를 추가적으로 선언해서 사용
		//문자열이 같다는 아직 사용하지 말기
		
		
		System.out.println("ForTest6 Finish");
	}

}
