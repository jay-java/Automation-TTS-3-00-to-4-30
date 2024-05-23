package core;
abstract class RBI{
	abstract public void interest();
 	abstract public void HL();
 	public static void repoRate() {
 		System.out.println("repo rate : +-4%");
 	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI interest : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL : 8%");
	}

}
class PNB extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("png interest: 8%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("pnb HL : 9%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interest : 6%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java HL 10%");
	}
	
}
public class P018_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		PNB p = new PNB();
		p.interest();
		p.HL();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		SBI.repoRate();
		PNB.repoRate();
		JAVA.repoRate();
	}
}
