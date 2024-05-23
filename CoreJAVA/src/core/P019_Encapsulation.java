package core;
class Person{
	private int id;
	private String name;
	private long contact;
	Person(int id,String name,long contact){
		this.id= id;
		this.name= name;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getContact() {
		return contact;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" contact : "+contact;
	}
}
public class P019_Encapsulation {
	public static void main(String[] args) {
		Person p1 = new Person(1, "rohan", 6485321);
//		System.out.println(p1.getId());
//		System.out.println(p1.getName());
//		System.out.println(p1.getContact());
		System.out.println(p1);
	}
}
