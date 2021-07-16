package com.cl.s4;

import java.util.Scanner;

public class Array_1 {
	
	public static void main(String[] args) {
		
		//11, 20, 32
		int num1 = 11;
		int num2 = 20;
		num2 = 30; //20 사라짐
		
		//모으려고 하는 데이터타입 [] 변수명 = new 모으려고 하는 데이터타입 [개수];
		int [] numbers = new int[3];
		
		//numbers 데이터타입은?
		//int []
		//int가 아니다
		System.out.println(numbers); //[I@1c4af82c 메모리의 시작점 주소
		
		//numbers : 데이터의 시작점 주소를 담고 있음, 데이터 타입 int []
		//numbers[0] 데이터타입 : int
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		System.out.println(numbers[0]); //10
		System.out.println(numbers[2]); //30
		
		System.out.println("배열의 크기 : " + numbers.length);
		
		// 3.12, 2.3, 4.123, 5.0 배열 선언하고 데이터 대입
		double [] dnums = new double[4];
		dnums[0] = 3.12;
		System.out.println(dnums[0]);
		
		//기본 초기값 0.0
		System.out.println(dnums[1]); //0.0
		
		//에러
		//System.out.println(dnums[4]);
		
		dnums[1] = 2.3;
		dnums[2] = 4.123;
		dnums[3] = 5.0;
		
		//문자열을 담을 배열 3칸짜리 생성
		//모두 출력
		String [] names = new String[3];
		//참조 타입 기본 초기값 null
		System.out.println(names[0]); //null
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		
		//스캐너를 담을 배열 2칸짜리 생성
		//모두 출력
		Scanner [] scs = new Scanner[2];
		System.out.println(scs[0]); //null
		System.out.println(scs[1]);
		
		
		
		
		
		
		
	}

}
