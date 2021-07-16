package com.cl.s3;

import java.util.Scanner;

public class HwTest2 {

	public static void main(String[] args) {
System.out.println("WhileTest2 Start");
		
		int id = 1234;
		int pw = 5678;
		
		//1. 로그인
		//   - id, pw 입력
		//	 - 로그인 판단
		//2. 종  료
		
		Scanner sc = new Scanner(System.in);
		int select = 0;
		boolean flag = false;
		
		boolean gameStart = false;
		
		while(!flag) {
			System.out.println("1. 로그인  :  2.종   료");
			select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("id 입력");
				int yId = sc.nextInt();
				System.out.println("pw 입력");
				int yPw = sc.nextInt();
				
				if(yId == id && yPw == pw) {
					System.out.println("로그인 성공");
					gameStart = !gameStart;
					flag = !flag;
				}else {
					System.out.println("로그인 실패");
				}
				
			}else if(select == 2) {
				flag = !flag;
			}
				
			
		}
		
		int level = 1;
		int gold = 0;
		int maxLevel = 0;
		int totalG =0;
		
		while(gameStart) {
			System.out.println("게임 시작");
			
			for(level = 1; level < 16; level++) {
				
				int num = level * 3;
				for(int i=1; i < num+1; i++) {
					System.out.println("몬스터 " + i + "마리 사냥");	
				}
				
				System.out.println(level + "레벨이 되었습니다.");
				

				if(level%5 == 0) {
					gold = level/5*1000;
					System.out.println(gold + "gold를 지급받았습니다.");
					totalG = totalG + gold;
				}
				
				maxLevel = maxLevel + 1;
				
				
			}
			break;
		}
		
		System.out.println("최종 레벨 : " + maxLevel);
		System.out.println("최종 골드 : " + totalG);
		
		System.out.println("Test2 Finish");

	}

}
