package com.cl.s4;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("과목의 수를 입력");
		
		int count = sc.nextInt();
		
		int [] nums = new int[count];
		//각 인덱스 번호에 숫자 입력
		for (int i = 0; i<count; i++) {
			System.out.println(i+1 + "번 점수 입력");
			nums[i] = sc.nextInt();
		}
		
		//index 0으로 시작, 1씩 증가
		int total = 0;
		
		for(int i = 0; i< nums.length; i++) {
			System.out.println(nums[i]);
			total = total + nums[i];
		}
		
		double avg = (double) total / nums.length;
		
		//총점과 평균 입력
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		

	}

}
