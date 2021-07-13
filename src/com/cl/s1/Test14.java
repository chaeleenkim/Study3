package com.cl.s1;

public class Test14 {
	
	public static void main(String [] args) {
		System.out.println("Test14 Start");
		
		//평균을 이용해서 A,B,C,D,F
		//평균이 90점 이상이면 A를 출력
		//평균이 80점 이상이면 B를 출력
		//평균이 70점 이상이면 C를 출력
		//평균이 60점 이상이면 D를 출력
		//그외 나머지 F를 출력
		//switch case
		
		int avg = 77;
	
		
		switch(avg/10) {
		case 10:
			//100점일 때 A 출력
			//System.out.println("A");
			//break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			break;
		}
	
		System.out.println("Test14 Finish");
	}

}
