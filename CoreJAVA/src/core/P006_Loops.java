package core;

import java.util.Scanner;

//1.for(initialization;condition;increment/decrement){body}
//2.while(condition){body}
//3.do{body} while(condition);
//4.for(Object o:data){body} -> for each
public class P006_Loops {
	public static void main(String[] args) {
		int i=110;
		i++; //i = i-1
		System.out.println(i);
		System.out.println("------------------");
		System.out.println("for loop");
		for(int a=-10;a>=1;a--) {//entry control loop
			System.out.println(a);
		}
		
		System.out.println("while loop");
		int j=10;
		while(j<=5) {//entry control loop
			System.out.println(j);
			j++;
		}
		
		System.out.println("do while loop");
		int k=10;
		do {//exit control loop
			System.out.println(k);
			k++;
		}
		while(k<=5);
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter num : ");
		int num  = sc.nextInt();
		for(int count=1;count<=10;count++) {
			System.out.println(num+ " X "+count+ " = "+(num*count));
		}
		
	}
}