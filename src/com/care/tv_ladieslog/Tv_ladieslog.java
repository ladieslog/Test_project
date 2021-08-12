package com.care.tv_ladieslog;

import java.util.Scanner;

public class Tv_ladieslog {
	public void display() {
		System.out.println("냉장고 하는 기능입니다. ");
		Scanner input =new Scanner(System.in);
		int num;
		System.out.println("1. up 2. down");
		num=input.nextInt();
		if(num==1) tempUp();
		else tempDown();
	}
	public void tempUp() {
		System.out.println("온도를 올립니다. ");
	}
	public void tempDown() {
		System.out.println("온도를 낮춥니다. ");
	}
}
