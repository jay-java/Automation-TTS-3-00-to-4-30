package core;

import java.util.Scanner;

public class P008_Array {
	public static void main(String[] args) {
		int i = 1, j = 2, k = 3, l = 4, p = 5;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7,8 };
		System.out.println("length of array : " + arr.length);
		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for(int index=0;index<a.length;index++) {
			System.out.print("enter element at a["+index+"] : ");
			a[index] = sc.nextInt();
		}
		
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]);
		}
		
		int sum=0;
		for(int index=0;index<a.length;index++) {
			sum = sum+a[index];
		}
		System.out.println("sum of ele : "+sum);
		
	}

}
