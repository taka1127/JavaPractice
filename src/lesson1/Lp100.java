package lesson1;

import java.util.HashMap;
import java.util.Map;

public class Lp100 {

	public static void main(String[] args) {
		Map<String,Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);

		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口：" + tokyo);
		prefs.remove("京都府");
		prefs.put("京都府", 120);
		int kyoto = prefs.get("京都府");
		prefs.put("熊本県", 21);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口："+ kumamoto);
		System.out.println("京都府の人口："+ kyoto);
		
		for(String key: prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key+ "の人口は"+ value);
		}

	}

}
