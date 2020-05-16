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
		System.out.println("url".matches("[a-z]{3}"));

		String s2 = "abc,def:ghi";
		String[] words = s2.split("[,:]");
		for(String w : words) {
			System.out.print(w + "->");
		}
		String s3 = "abc,def:ghi";
		String w = s3.replaceAll("[bef]","X");
		System.out.println("\n"+w);



	}

}
