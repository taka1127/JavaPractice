package lesson1;

public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは"+s1.length()+"です");
		if(s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}else {
			System.out.println("s1は"+s1+"です");
		}

		String s4 = "Java and JavaScript";
		if(s4.contains("Java")) {
			System.out.println("文字列s4は、Javaを含んでいます");
		}
		if(s4.endsWith("JavaScript")) {
			System.out.println("文字列s4は、JavaScriptが末尾にあります");
		}else {
			System.out.println("末尾にｔがありません");
		}

		System.out.println("文字列s4の長さは"+s4.length());
		System.out.println("文字列s4で最初にaが登場する位置は"+s4.indexOf("a"));
		System.out.println("文字列s4で最後にScriptが登場する位置は"+s4.lastIndexOf("Script"));

		System.out.println("文字列s4の４文字目以降は"+s4.substring(3));
		System.out.println("文字列s4の４~8文字目は"+s4.substring(3,8));
		System.out.println("文字列s4の４文字目は"+s4.charAt(3));


		String s5 = "       ←空文字です";
		System.out.println("Java and JavaScriptを小文字に変換："+s4.toLowerCase());
		System.out.println("Java and JavaScriptを大文字に変換："+s4.toUpperCase());
		System.out.println(s5+"の先頭と末尾の空文字をなくす："+s5.trim());
		System.out.println("JavaをPHPに変換："+s4.replace("Java", "PHP"));
	}

}
