package com.cl.s2;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String [] args) {
		System.out.println("ForTest5 Start");
		
		//총합을 담을 변수
		int total = 0;
		//평균을 담을 변수
		double avg = 0.0;
		//과목 수를 담을 변수
		int count = 0;
		
		//과목 수 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 수 입력");
		count = sc.nextInt();
		
		//과목 수 만큼 점수 입력
		for (int i=0; i < count; i++) {
			
			//n번째임을 알려주는 것이 사용자가 편리
			System.out.println(i+1 + "번째 점수 입력");
			int score = sc.nextInt();
			total = total + score;
		}
		System.out.println("총점 : " + total);
		
		//총점 평균 계산 후 출력
		avg = total / (double) count;
		System.out.println("평균 : "+ avg);
		
		
		//for문 내부 등 임시로 쓰는 변수는 변수 안에서 선언
		//계속 쓰는 변수는 위에서 선언하는 것이 좋다
		
		
		System.out.println("ForTest5 Finish");
	}

}
