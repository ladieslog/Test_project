package com.care.tv_jinsung;

import java.util.Scanner;

public class Tv_jinsung {

		public void display() {
			System.out.println("냉장고 기능");
			Scanner in = new Scanner(System.in);
			int num;
			System.out.println("1.올림, 2.내림");
			num = in.nextInt();
			if(num==1) tempUp();
			else tempDown();
		}
	
		private void tempUp() {
			System.out.println("온도 올립니다");
		}
		private void tempDown() {
			System.out.println("온도 내립니다");
		}
		
		
	
}
