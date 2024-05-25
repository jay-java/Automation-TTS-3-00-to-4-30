package core;
interface inter1{
	public void interface1();
	public static void staticInterface1() {
		System.out.println("static in interface 1");
	}
}
interface inter2 extends inter1{
	public void interface2();
	public static void staticInterface2() {
		System.out.println("static in interface 2");
	}
}
interface inter3{
	public void interface3();
	public static void staticInterface3() {
		System.out.println("static in interface 3");
	}
}
class CallInterface implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class P021_Interface {
	public static void main(String[] args) {
		CallInterface c = new CallInterface();
		c.interface1();
		c.interface2();
		c.interface3();
		inter1.staticInterface1();
		inter2.staticInterface2();
		inter3.staticInterface3();
		
	}
}