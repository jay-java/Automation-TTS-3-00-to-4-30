package core;

import java.util.Scanner;

public class P005_ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
//		if(a == b) {
//			System.out.println("equals");
//		}
//		else {
//			System.out.println("not equal");
//		}
		
		
		// 1.simple if
		if (a > b) {
			System.out.println("a is greater than b");
		}

		// 2.if else
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// 3.nested if
		System.out.println("enter age = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 50) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 50");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("D grade");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C grade");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B grade");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A grade");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.Switch case
		System.out.println("1.English\n2.Hindi\n3.Gujarati");
		System.out.println("enter your choice : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("You selected English");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("You selected Gujarati");
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}
}
