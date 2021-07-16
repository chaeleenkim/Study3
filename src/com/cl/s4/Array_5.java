package com.cl.s4;

import java.util.Scanner;

public class Array_5 {
	
	public static void main(String[] args) {
		
		//1. 정보출력
		//2. 정보추가
		//3. 정보삭제
		//4. 종   료
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		//int [] 선언하면서 new() 쓰지 않고 데이터 바로 대입할 수 있다
		int [] ar = {45, 52, 76};
		//int [] ar = new int[3]
		//ar[0] = 45;
		//ar[1] = 52;
		//ar[2] = 76;
		
		
		while(flag) {
			System.out.println("1.정보출력  2. 정보추가  3. 정보삭제  4. 검색삭제 5. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				
				if(ar.length >0) {
					System.out.println("정보를 출력합니다");
					for(int i=0; i<ar.length; i++) {
						System.out.println(ar[i]);
					}
					break;
				} else {
					System.out.println("data가 없어요");
				}
				
				
				
			case 2: 
				System.out.println("추가할 정보 입력");
				int info = sc.nextInt();
				int [] ar2 = new int[ar.length +1];
				//copy
				for(int i=0; i<ar.length; i++) {
					ar2[i] = ar[i];
				}
				
				ar2[ar.length] = info;
				ar = ar2;
				break;
				
			case 3:
				System.out.println("정보를 삭제합니다");
				
				if(ar.length ==0) {
					System.out.println("더 이상 삭제할 데이터가 없어요");
					continue;
					//break; 가능, switch case만 벗어남
				}
				
				//switch case는 ar2 변수명 못쓴다
				//break 없으면 중복선언 될 수 있기 때문에
				int [] ar3 = new int[ar.length -1];
				for(int i=0; i<ar3.length; i++) {
					ar3[i] = ar[i];
				}
				
				ar=ar3;
				break;
			case 4:
			//두 인덱스 번호가 서로 다르게 돌아가는 경우에는
			//두개를 따로 선언하는 것이 편하다
				
				if(ar.length == 0) {
					System.out.println("data가 없어요");
					continue;
				}
				
				System.out.println("삭제할 인덱스 번호 입력");
				int del = sc.nextInt();
				if(del >= ar.length || del <0) {
					System.out.println("범위를 벗어남");
					continue;
				}
				
				int [] ar4 = new int[ar.length - 1];
				int index = 0;
				for(int i=0; i<ar.length; i++) {
					if(del==i ) {
						continue;
					}
					ar4[index] = ar[i];
					index++;
				}
				
				ar = ar4;
				
				//내 풀이
//				for(int i=0; i<del; i++) {
//					ar4[i] = ar[i];
//				}
//				for(int i=del; i<ar4.length; i++) {
//					ar4[i] = ar[i+1];
//				}
//				
//				ar = ar4;
				break;
			default:
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			}
		}
		
		
		
		
	}

}
