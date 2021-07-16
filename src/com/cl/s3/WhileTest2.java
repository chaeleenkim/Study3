package com.cl.s3;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		
		
		//예제 1 - 로그인 판단
		int id = 1234;
		int pw = 5678;
		
		//1. 로그인
		//   - id, pw 입력
		//	 - 로그인 판단
		//2. 종  료
		
		Scanner sc = new Scanner(System.in);
		int select = 0;
		boolean flag = true;
		
		
		while(flag) {
			System.out.println("1. 로그인  :  2.종   료");
			select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("id 입력");
				int yId = sc.nextInt();
				System.out.println("pw 입력");
				int yPw = sc.nextInt();
				
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					break; 
					//flag = false;
				}else {
					System.out.println("로그인 실패");
				}
				
			}else {
				System.out.println("종   료");
				flag = false;
				//break;
			}
				
			
		}
		
		//로그인 판단
		
		//코드 일부분만 실행하고 싶으면 flag를 false로 준다
		//끝날 때 꼭 삭제
		flag = false;
		if (!flag) {
			System.out.println("로그인 성공 했을 때 실행");
			
			int level = 1;
			int gold = 0;
			
			for(level=1; level<15; level++) {
				
				//골드지급
				if(level%5 ==0) {
					gold = gold + level/5*1000;
					System.out.println(level/5*1000 + " gold 지급");
				}
				
				
				System.out.println("현재레벨 : " + level);
				
				//사냥
				for(int mon=0; mon < level*3  ; mon++) {
					
					System.out.println(mon+1 + "마리 사냥 성공");
				}
				
				
				System.out.println("====== 축 레벨업 ======");
				
			}
			System.out.println("최종 레벨 : " + level);
			gold = gold + level/5*1000;
			System.out.println("최종 Gold : " + gold);
		}
		
		
		//큰 틀을 먼저 잡고 안의 내용을 채운다
		//어떤 도구를 선택할지에 대한 고민 하기
		
		
		
		
		//예제 2
		//로그인이 성공했으면 게임을 시작
		//	로그인 판단 끝나고 while문 밑에서 게임 시작
		//rpg 게임
		//최초 레벨은 1, 만렙 15
		//최초gold : 0
		//레벨 5를 달성 시 1000gold 지급받음
		//레벨 10을 달성 시 2000gold 지급받음
		//레벨 15 달성 시 3000gold 지급받음
		
		//모든 몬스터의 경험치는 동일
		// 1 -> 2 : 3
		// 몬스터 1마리 사냥
		// 몬스터 2마리 사냥
		// 몬스터 3마리 사냥
		// 레벨업
		// 2 -> 3 : 6
		// 몬스터 1마리 사냥
		// 몬스터 2마리 사냥
		// 몬스터 3마리 사냥
		// 몬스터 4마리 사냥
		// 몬스터 5마리 사냥
		// 몬스터 6마리 사냥
		// 레벨업
		// 3 -> 4 : 9
		// 4 -> 5 : 12
		// 5 -> 6 : 15
		//...
		// 14 -> 15 : 42
		// 최종 레벨 출력
		// 최종 gold 출력
		
	
		
		System.out.println("WhileTest2 Finish");

	}

}
