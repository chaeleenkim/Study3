package com.cl.s2;

import java.util.Scanner;

public class ForTest1 {
	
	public static void main(String [] args) {
		System.out.println("ForTest1 Start");
		
		//1)초기식
		//2)조건식
		//3)true이면 실행
		//4)증감식
		//5)다시 조건식
		//6)조건식이 false이면 실행하지 않고 for문 나간다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수를 입력");
		int count = sc.nextInt();
		//int num = 0;
		for(int i=0; i<count; i++) {
			//조건식이 true일 때 실행
			System.out.println("Hello" + i);
			
			//System.out.println("Hello" + num);
			//num++;
			
		}
		//for문에서 선언된 변수는 지역변수
		//int i=0; 중복선언 아님
		
		
		//예제
		//0 - 20 사이에 짝수만 출력
		for(int i = 0; i <= 20 ; i++) {
			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("==================================");
		// 0 - 20 미만 사이의 짝수만 출력
		//단 if문을 사용하지 않고 출력
		
		//증감식에 1 말고 다른 수도 가능
		for(int i = 0; i < 20 ; i = i + 2) {
			System.out.println(i);
		}
		
		
		
		
		System.out.println("ForTest1 Finish");
	}

}
