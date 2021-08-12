  
package com.care.def;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num;
		System.out.println("---가전제품---");
		while(true) {
			System.out.println("1.냉장고");
			System.out.println("2.세탁기");
			System.out.println("3.tv");
			System.out.println("4.버전 다름 ");
			System.out.println("5.레지토리 폭주");
			System.out.print(">>>> ");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("냉장고"); break;
			case 2:
				System.out.println("tv"); break;
			case 3:
				System.out.println("세탁기"); break;
			}
		}
	}
}	