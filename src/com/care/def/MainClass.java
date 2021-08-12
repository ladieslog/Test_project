package com.care.def;

import java.util.Scanner;
<<<<<<< HEAD

import com.care.tv_jinsung.Tv_jinsung;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tv_jinsung tv = new Tv_jinsung();
		
		tv.display();
		
		
	}
}
=======

public class MainClass {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num;
		System.out.println("---°¡ÀüÁ¦Ç°---");
		while(true) {
			System.out.println("1.³ÃÀå°í");
			System.out.println("2.¼¼Å¹±â");
			System.out.println("3.tv");
			System.out.println("4.¹öÀü ´Ù¸§ ");
			System.out.println("5.·¹ÁöÅä¸® ÆøÁÖ");
			System.out.print(">>>> ");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("³ÃÀå°í"); break;
			case 2:
				System.out.println("tv"); break;
			case 3:
				System.out.println("¼¼Å¹±â"); break;
			}
		}
	}
}	
>>>>>>> b4798e1ced259aa570a8fb34bf60895d4cb5e0d9
