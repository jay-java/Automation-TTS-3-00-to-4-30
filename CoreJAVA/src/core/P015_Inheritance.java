package core;
class A{
	public void classA() {
		System.out.println("class A");
	}
}
class B extends A{
	public void classB() {
		System.out.println("class B");
	}
}
class C extends B{
	public void classC() {
		System.out.println("class C");
	}
}

class D{
	public void classD() {
		System.out.println("class D");
	}
}
class E extends D{
	public void classE() {
		System.out.println("class E");
	}
}
class F extends D{
	public void classF() {
		System.out.println("class F");
	}
}
public class P015_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
		C c = new C();
		c.classA();
		c.classB();
		c.classC();
		E e = new E();
		e.classD();
		e.classE();
		F f = new F();
		f.classD();
		f.classF();
	}
}
