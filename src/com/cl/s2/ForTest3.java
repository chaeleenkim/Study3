package com.cl.s2;

import java.util.Scanner;

public class ForTest3 {
	
	public static void main(String [] args) {
		System.out.println("ForTest3 Start");
		
		//종료 시간을 입력 받기
		// ex) 12초
		// 0초, 1초 ... 12초 끝
		// 단 60 상수는 변경 불가능 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("종료 시간 입력");
		int input = sc.nextInt();
		
		for(int sec=0; sec<60; sec++) {
			System.out.println(sec + "초");
			if(sec == input) {
				sec = 59;
			}
			
		}
		
		
		System.out.println("ForTest3 Finish");
	}

}
