package basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter range : ");
		int num = sc.nextInt();
		
		for(int i=2;i<=num;i++) {
			int factors = 0;
			for(int j=i;j>=1;j--) {
				if((i % j)==0) {
					
					factors++;
				}
			}
			if(factors == 2) {
//				System.out.println(i+ " ");
			}
		}
		
		
//		for(int i=1;i<=num;i++) {
//			if((num%i)==0) {
//				factors++;
//			}
//		}
//		if(factors==2) {
//			System.out.println(num+" is prime");
//		}
//		else {
//			System.out.println(num+" is not prime");
//		}
	}
}
