package core;

import java.util.Scanner;

public class P010_factorial {
	public static void main(String[] args) {
		int i, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num to find factorial : ");
		int num = sc.nextInt();
		for(i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("factorail of "+num+" is : "+fact);
	}
}