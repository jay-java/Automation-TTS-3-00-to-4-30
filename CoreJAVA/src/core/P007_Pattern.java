package core;

public class P007_Pattern {
	public static void main(String[] args) {
		for(int i =1;i<=4;i++) {//rows
			for(int j =1;j<=5;j++) {//columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i =1;i<=5;i++) {//rows
			for(int j =1;j<=i;j++) {//columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i =1;i<=5;i++) {//rows
			for(int j =1;j<=i;j++) {//columns
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i =1;i<=5;i++) {//rows
			for(int j =1;j<=i;j++) {//columns
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
