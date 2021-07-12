package com.cl.s1;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String [] args) {
		System.out.println("Test6 Start");
		
		//kor, eng, math 입력
		//총점, 평균 계산
		//평균이 60점 이상이면 합격 아니면 불합격 출력
	
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		total = kor+eng+math;
		avg = total/3.0;
		
		
		
		
		//단일 if문만 사용
		String result = " ";
		result = "불합격";
		
		if (avg >= 60) {
			result = "합격";
			}
		
		System.out.println(result);

		
		
/*		
		if(avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
*/		

		
		
		
/* 내풀이
		System.out.println("국어 점수 입력");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		int math = sc.nextInt();
		
		int total= kor + eng + math;
		double avg = total /3.0;
		
		if(avg >=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
*/
		
/*
		int num = 4; 
		
		if(num % 2 != 0) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
*/
		
		System.out.println("Test6 Finish");
		
	}
}
