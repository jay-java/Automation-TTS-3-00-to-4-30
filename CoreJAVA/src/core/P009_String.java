package core;

public class P009_String {
	public static void main(String[] args) {
		char c[]= {'J','A','V','A'};
		System.out.println(c);
		String name = "java technology is best to learn in IT field";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(name.contains("best"));
		String s3 = "				java			";
		System.out.println(s3.trim());
		
	}
	
}
