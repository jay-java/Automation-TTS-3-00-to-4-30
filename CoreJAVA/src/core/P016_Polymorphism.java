package core;
class Calculate{
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public void add(int i,int j,int k,int l) {
		System.out.println(i+j+k+l);
	}
}
public class P016_Polymorphism {
	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.add(1, 2);
		c.add(1, 2, 3);
	}
}
