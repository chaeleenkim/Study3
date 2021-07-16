package com.cl.s4;

public class Array_3 {

	public static void main(String[] args) {
		
		int[] ar1 = new int[2];
		ar1[0] = 10;
		ar1[1] = 20;
		
		int [] ar2;
		//ar1의 주소 값을 ar2에 대입
		//얕은 복사 : 주소만 복사
		ar2 = ar1;
		
		
		System.out.println(ar2[0]); //10
		
		ar1[1] = 1111;
		System.out.println(ar2[1]); //1111
		
		//깊은 복사 : 새로운 배열 만들고 데이터 자체를 복사
		int [] ar3 = new int[ar1.length];
		System.out.println(ar3[0]); //0
		
		for(int i=0; i<ar1.length; i++) {
			ar3[i] = ar1[i];
		}
		
		System.out.println(ar3[0]); //10
		
		ar1[0] = 2222;
		
		System.out.println(ar3[0]); //10
	}

}
