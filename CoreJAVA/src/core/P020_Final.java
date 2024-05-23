package core;
final class Calc{
 	final int i=1;
	final public void change() {
		i++;
		System.out.println(i);
	}
}
class ChildCalc extends Calc{
	public void change() {
		System.out.println("child calc");
	}
}
public class P020_Final {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.change();
	}
}
