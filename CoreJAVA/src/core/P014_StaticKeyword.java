package core;

class College{
	int id;
	String name;
	static String college_name = "LJ";
	public void getData(int id,String name) {
		System.out.println("id : "+id+" name : "+name+" college name : "+college_name);
	}
	public static void staticFunctin() {
		System.out.println("static function");
	}
}
public class P014_StaticKeyword {
	public static void main(String[] args) {
		College s1 = new College();
		s1.getData(1,"aniket");
		
		College s2 = new College();
		s2.getData(2,"poonam");
		
		College s3 = new College();
		s3.getData(3,"sonaram");
		
		College s4 = new College();
		s4.getData(4,"rohan");
		
		College s5 = new College();
		s5.getData(5,"tushar");
		
		College.staticFunctin();
		
	}
}
