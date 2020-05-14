package lesson1;

public class RegularExpressions {

	public static void main(String[] args) {
		String s = "Java";

		System.out.println(s.matches("Java"));
		System.out.println(s.matches("JavaJava"));
		System.out.println(s.matches("java"));
		System.out.println(s.matches("J.va"));
		System.out.println("Jaaaaaava".matches("Ja*va"));
		System.out.println("あいうxx019".matches(".*"));
		


	}

}
