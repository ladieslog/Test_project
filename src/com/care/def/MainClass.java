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
		System.out.println("---������ǰ---");
		while(true) {
			System.out.println("1.�����");
			System.out.println("2.��Ź��");
			System.out.println("3.tv");
			System.out.println("4.���� �ٸ� ");
			System.out.println("5.�����丮 ����");
			System.out.print(">>>> ");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println("�����"); break;
			case 2:
				System.out.println("tv"); break;
			case 3:
				System.out.println("��Ź��"); break;
			}
		}
	}
}	
>>>>>>> b4798e1ced259aa570a8fb34bf60895d4cb5e0d9
