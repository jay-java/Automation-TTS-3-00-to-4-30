package core;

import java.util.Scanner;

class CallClass{
	public void calling() {
		System.out.println("without return type without parameter");
	}
	public void add(int a,int b,String name) {
		System.out.println("without return type with parameter = "+(a+b));
	}
	public int returnValue() {
		return 12345;
	}
	public int returnSqaure(int num) {
		return num*num;
	}
	public String printName() {
		return "java";
	}
}
public class P011_Function {
	public static void main(String[] args) {
		System.out.println("hello");
		CallClass c = new CallClass();
		c.calling();
		c.add(10,23,"java technology@#$$%325");
		int i = c.returnValue();
		System.out.println(i);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num to get Sqaure : ");
		int num = sc.nextInt();
		int res = c.returnSqaure(num);
		System.out.println("square of "+num+ " is "+res);
		String name= c.printName();
		System.out.println(name);
	}
}