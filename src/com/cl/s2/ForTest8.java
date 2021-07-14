package com.cl.s2;

import java.util.Scanner;

public class ForTest8 {
	
	public static void main(String[] args) {
		System.out.println("ForTest8 Start");
		// 분 초 출력
		//0분0초
		//0분1초
		//...
		//0분59초
		//1분0초
		//...
		//59분 59초
		
		int min=0;
		int sec=0;

/*		
		for(min=0; min<60; min++) {
			for(sec=0; sec<60; sec++) {
				System.out.println(min + "분 : " + sec + "초");
			}
		}
*/
		
		//분, 초를 입력
		//입력된 분 : 초에 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		boolean flag = false;
		
		for(min=0; min<60; min++) {
			for(sec=0; sec<60; sec++) {
				System.out.println(min + "분 : " + sec + "초");
				if(m == min && s == sec) {
					System.out.println("종료");
					flag = true;
					break;
				}
			} //안쪽 for
			
			//바깥쪽 for도 flag로 한번 더 break해야 종료
			if(flag) {
				break;
			}
			
			
		}
		
		
		
			
		
		
		System.out.println("ForTest8 Finish");
	}

}
