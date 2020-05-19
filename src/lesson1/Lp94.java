package lesson1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lp94 {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("黄");
		colors.add("黄");
		colors.add("青");
		System.out.println(colors);
		System.out.println("色は"+colors.size()+"種類");

		Set<String> animal = new TreeSet<>();
		Set<String> a = animal;
		a.add("dog");
		a.add("cat");
		a.add("wolf");
		a.add("panda");
		for(String s : a) {
			System.out.print(s+"->");
		}




	}

}
