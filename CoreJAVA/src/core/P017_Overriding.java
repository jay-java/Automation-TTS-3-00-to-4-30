package core;
class Parent{
	public void call() {
		System.out.println("call in parent");
	}
}
class Child extends Parent{
	public void call() {
		super.call();
		System.out.println("call in child");
	}
}
public class P017_Overriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.call();
	}
}
