package core;
class Employee{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id= id;
		this.name= name;
		this.salary=salary;
//		System.out.println("default cons");
	}
	public void getData() {
		System.out.println("id : "+id+" name: "+name+" salary : "+salary );
	}
}
public class P013_ThisKeyword {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"java", 20000.30);
		e1.getData();
	}
}
