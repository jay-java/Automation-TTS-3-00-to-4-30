package core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P022_Exception {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a = ");
			int a = sc.nextInt();
			System.out.println("enter b = ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		}

		catch (ArithmeticException e) {
			System.out.println("denominator should be greater than 0");
		} catch (InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("this will executes everytime");
		}

	}
}
