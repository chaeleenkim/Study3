package com.cl.s2;

import java.util.Scanner;

public class ForTest9 {

	public static void main(String[] args) {
		System.out.println("ForTest9 Start");
		
		//FPS
		// 탄창 3개
		// 한 탄창에 30발
		// 단발 모드 1발, 점사 모드 3발 소비
		//1.단발? 2/다른 번호.점사?
		// 1- 탕 30번
		// 2- 타타탕 10번
		//모드 선택 : 한 탄창마다
		
		int gunCase = 0; //탄창
		int bullet = 0; //총알
		
		Scanner sc = new Scanner(System.in);
		
		for(gunCase=0; gunCase < 3; gunCase++) {
			System.out.println(gunCase+1 + "번째 탄창");
			System.out.println("1.단발? 2.점사?");
			int mode = sc.nextInt();
			
			switch(mode) {
			
			case 1:
				 for(bullet=0; bullet<30; bullet++) {
					 System.out.println("탕");
				 }
				 break;
			case 2:
				for(bullet=0; bullet<10; bullet++) {
					System.out.println("타타탕");
				}
				break;
			}
		}
		
		
		
		
		System.out.println("ForTest9 Finish");

	}

}
