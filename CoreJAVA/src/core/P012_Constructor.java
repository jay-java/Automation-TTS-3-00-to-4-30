package core;
class Area{
	Area(){
		System.out.println("defualt cons");
	}
	Area(int i,int j){
		System.out.println("cons with int args : ");
	}
	Area(String name){
		System.out.println("name : "+name);
	}
	Area(double value){
		System.out.println(value);
	}
	public void getArea() {
		System.out.println("function of area class");
	}
}
public class P012_Constructor {
	public static void main(String[] args) {
		Area a = new Area(12.3);
		a.getArea();
	}
}