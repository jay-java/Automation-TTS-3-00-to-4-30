package core;

import java.util.Scanner;

public class P005_ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		//1.simple if
		if(a>b) {
			System.out.println("a is greater than b");
		}
		
		//2.if else
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		
		//3.nested if
		System.out.println("enter age = ");
		int age = sc.nextInt();
		if(age>18) {
			if(age<50) {
				System.out.println("you are eligible");
			}
			else {
				System.out.println("age is greater than 18 but not less than 50");
			}
		}
		else {
			System.out.println("age is less than 18");
		}
	}
}
