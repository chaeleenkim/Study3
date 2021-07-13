package com.cl.s1;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String [] args) {
		System.out.println("Test8 Start");
		
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
		
		// 합격 기준
		// 평균이 60점 이상
		// 과목당 40점 이상
		
/* 		
 		//내 풀이		
		if((kor < 40 || eng < 40 || math < 40) || avg < 60) {
			System.out.println("불합격");			
		}else {
			System.out.println("합격");
		}
				
		System.out.println("Test8 Finish");
*/
		
//		--------------------------3차 코드------------------------------
		if(avg>=60 && kor>40 && eng>40 && math>40) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
//		--------------------------3차 코드------------------------------
		
		
/*		
		--------------------------2차 코드------------------------------
		if (avg >= 60) {
			if(kor>40 && eng>40 && math>40) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
		--------------------------2차 코드------------------------------
		
		
	
  		--------------------------1차 코드------------------------------
		if(avg >= 60) {
			if(kor>40) {
				if(eng > 40) {
					if(math > 40) {
						System.out.println("합격");
					}else {
						System.out.println("수학 과락 불합격");
					}
					System.out.println("합격");
				}else {
					System.out.println("영어 과락 불합격");
				}
				System.out.println("합격");
			}else {
				System.out.println("국어 과락 불합격");
			}
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		--------------------------1차 코드------------------------------
*/
		
		//단축키
		//ctrl + Shift + / : 선택한 블럭 전체 주석처리 (해제 : ctrl + Shift + \)
		//ctrl + / : 단일주석, 해제
		
		
	}
	

}
