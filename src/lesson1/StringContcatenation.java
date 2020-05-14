package lesson1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringContcatenation {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//Stringの連結（＋での連結より4604倍高速）
		StringBuilder sb = new StringBuilder();
		for(int i=0; i < 100; i++) {
			sb.append("Java\n");
		}
		String s = sb.toString();
//		System.out.println(s);

		String str = "こんにちは！Java";
		char[] data1 = str.toCharArray();
		byte[] data3 = str.getBytes("utf-8");
		byte[] data4 = str.getBytes(StandardCharsets.UTF_8);
		byte[] data2 = str.getBytes();
		System.out.println(data1);
		System.out.println(data3);
		System.out.println(data4);
		System.out.println(data2);
	}

}
