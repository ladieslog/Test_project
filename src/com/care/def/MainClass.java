  
package com.care.def;

import java.util.Scanner;

import com.care.tv_jinsung.Tv_jinsung;
import com.care.tv_ladieslog.Tv_ladieslog;


public class MainClass {
	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		Tv_jinsung tv_jinsung = new Tv_jinsung();
		Tv_ladieslog tv_ladieslog =new Tv_ladieslog();


		

		int num;
		System.out.println("---������ǰ---");
		while(true) {
			System.out.println("1.�����");


			System.out.println("2.�� ����?");
			System.out.println("3.�ٵ� ������? ");

			System.out.println("2.��Ź��");
			System.out.println("3.tv");

			System.out.println("4.���� �ٸ� ");
			System.out.println("5.�����丮 ����");
			System.out.print(">>>> ");
			
			num=input.nextInt();
			switch(num) {
			case 1:
				tv_jinsung.display();
				tv_ladieslog.display();

				System.out.println("�����"); 
				break;
			
			}
		}
	}
}	
