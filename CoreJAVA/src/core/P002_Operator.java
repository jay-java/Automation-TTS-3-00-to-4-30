package core;

public class P002_Operator {
	public static void main(String[] args) {
		int i = 10, j = 20, k = 30;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		int addition = i+j;
		System.out.println(addition);
		int sub =i-j;
		System.out.println(sub);
		int a = 10,b=3;
		System.out.println(a%b);
		
		int length = 12,breadth = 3;
		int areaOfRectangle = length  * breadth;
		System.out.println("area of arectangle = "+areaOfRectangle);
		System.out.println("area of arectangle = "+(length  * breadth));
		
		double radius = 3;
		double areaOfVCircle  = Math.PI*radius*radius;
		System.out.println("area of circle = "+areaOfVCircle);
	}
}
