package com.cl.s2;

public class ForTest4 {
	
	public static void main(String [] args) {
		System.out.println("ForTest4 Start");
		
		// 1 + 2 + 3....+ 1000000
		//1+2+3+4+5=15
		
		int hap = 0;   //누적 함수
		hap = hap + 1; //1
		hap = hap + 2; //3
		hap = hap + 3; //6
		hap = hap + 4; //10
		hap = hap + 5; //15
		
		System.out.println("hap : " + hap);
		
		//반복문... 5번
		
		int sum = 0;
		for(int i = 1; i < 6; i++) {
			
			//5번 도는지 확인
			//System.out.println(i);
			
			sum = sum + i;
			
			//실수 : 영역 내에서 sum이 0으로 계속 선언 되므로 누적해서 더해지지 않음
			//int sum = 0;
			//sum = sum + i;
			System.out.println(sum);
		}
		System.out.println("총 합 : " + sum);
		
		
	
		
		
		System.out.println("ForTest4 Finish");
	}

}
