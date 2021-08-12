  
package com.care.def;

import java.util.Scanner;

import com.care.tv_ladieslog.Tv_ladieslog;

public class MainClass {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Tv_ladieslog tv_ladieslog =new Tv_ladieslog();
		int num;
		System.out.println("---∞°¿¸¡¶«∞---");
		while(true) {
			System.out.println("1.≥√¿Â∞Ì");
			System.out.println("2.ºº≈π±‚");
			System.out.println("3.tv");
			System.out.println("4.πˆ¿¸ ¥Ÿ∏ß ");
			System.out.println("5.∑π¡ˆ≈‰∏Æ ∆¯¡÷");
			System.out.print(">>>> ");
			num=input.nextInt();
			switch(num) {
			case 1:
				tv_ladieslog.display();
				System.out.println("≥√¿Â∞Ì"); break;
			case 2:
				System.out.println("tv"); break;
			case 3:
				System.out.println("ºº≈π±‚"); break;
			}
		}
	}
}	