package com.cl.s1;

import java.util.Scanner;

public class Test11 {
	
	public static void main(String [] args) {
		System.out.println("Test11 Start");
		
		//국어, 영어, 수학 입력
		//총점 평균 계산
		
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//평균이 60점 이상이면 D를 출력
		//그외 나머지 F를 출력
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else if(avg >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
				
		System.out.println("Test11 Finish");
		
	}

}
