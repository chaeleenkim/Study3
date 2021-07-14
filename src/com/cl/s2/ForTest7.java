package com.cl.s2;

public class ForTest7 {
	
	public static void main(String[] args) {
		System.out.println("Test7 Start");
		
		//이중 for - for문 안의 for
		for(int dan=2; dan<10; dan++) {
			System.out.println(dan + "단");
			for(int num=1; num<10; num++) {
				System.out.println(dan + "*" + num + "=" + dan*num);
			}	
			System.out.println("=======================================");
		}
		
		
		System.out.println("Test7 Finish");
	}

}
