package core;

import java.util.Scanner;

class Call{
	public void calling() {
		System.out.println("calling function calling");
	}
	public void run() {
		System.out.println("run function");
	}
}
public class P004_UserInput {
	public static void main(String[] args) {
		int i = 10, j = 20;
		System.out.println(i + j);
		Call obj = new Call();
		obj.calling();
		obj.run();
		Scanner sonaram = new Scanner(System.in);
		System.out.println("etner a = ");
		int a = sonaram.nextInt();
		System.out.println("enter b = ");
		int b = sonaram.nextInt();
		int c = a-b;
		System.out.println(c);
		
		System.out.println("enter height of triangle = ");
		double height = sonaram.nextDouble();
		System.out.println("enter base of treaingle = ");
		double base = sonaram.nextDouble();
		double areaOfTriangle = (base*height)/2;
		System.out.println("area of traingle = "+areaOfTriangle);
	}
}
