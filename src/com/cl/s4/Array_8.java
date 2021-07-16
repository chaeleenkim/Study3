package com.cl.s4;

import java.util.Scanner;

public class Array_8 {
	
	public static void main(String[] args) {
		int [] ids = {1234, 4567, 4356, 1258};
		int [] pws = {6789, 5437, 1235, 9874};
		
		//1. 로그인 2.회원가입 3. 종료
		
		Scanner sc = new Scanner(System.in);
		int id = 0;
		int pw = 0;
		boolean flag = true;
		int [] tmpIds = new int [ids.length + 1];
		int [] tmpPws = new int [pws.length + 1];
		
		//프로그램 시작
		while(flag) {
			System.out.println("1. 로그인   2.회원가입   3. 종료");
			int select = sc.nextInt();
			
			switch(select) {
			
			//로그인
			case 1: 
				System.out.println("로그인 시도");
				System.out.println("Id 입력");
				int yId = sc.nextInt();
				System.out.println("Pw 입력");
				int yPw = sc.nextInt();
				String login = "로그인 실패";
				
				//로그인 판단
				for(int i=0; i<ids.length; i++) {
					
					if(yId == ids[i] && yPw == pws[i]) {
						login = "로그인 성공";
						flag = false;
						break;
					}
				}
				
				System.out.println(login);
				break;
				
			
			//회원가입
			case 2:
				
				boolean check = true;
				
				System.out.println("회원가입");
				System.out.println("Id를 설정하세요");
				int newId = sc.nextInt();
				
				//id 중복 판단
				for(int i=0; i<ids.length; i++) {
					if(newId == ids[i]) {
						System.out.println("중복된 id입니다");
						check = false;
					}
				}
			
				
				while(check) {
					System.out.println("Pw를 설정하세요");
					int newPw = sc.nextInt();
					
					
					//회원 추가
					//아이디 추가
					for(int i=0; i<ids.length; i++) {
						tmpIds[i] = ids[i];
					}
					tmpIds[ids.length] = newId;
					ids = tmpIds;
							
					
					//비밀번호 추가
					for(int i=0; i<pws.length; i++) {
						tmpPws[i] = pws[i];
					}
					tmpPws[pws.length] = newPw;
					pws = tmpPws;
					
					check = false;
				}//while
					
				
				
				break;
				
			//종료
			default : 
				System.out.println("종료합니다");
				flag = false;
			}
				
		}
		
		
		
	}

}


