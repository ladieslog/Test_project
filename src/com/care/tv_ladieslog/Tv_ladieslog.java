package com.care.tv_ladieslog;

import java.util.Scanner;

public class Tv_ladieslog {
	public void display() {
		System.out.println("����� �ϴ� ����Դϴ�. ");
		Scanner input =new Scanner(System.in);
		int num;
		System.out.println("1. up 2. down");
		num=input.nextInt();
		if(num==1) tempUp();
		else tempDown();
	}
	public void tempUp() {
		System.out.println("�µ��� �ø��ϴ�. ");
	}
	public void tempDown() {
		System.out.println("�µ��� ����ϴ�. ");
	}
}
