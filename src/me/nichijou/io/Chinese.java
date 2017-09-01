package me.nichijou.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nichijou on 8/30/17.
 */
public class Chinese {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("1234锄a禾日当午,汗滴禾下土".getBytes())));
		// a char 2 bytes, how to handle u8? 是字节流已经是两字节的unicode了吗？
		char[] buf = new char[5];
		br.read(buf);
		System.out.println(new String(buf));
		String a = null;
		String b = "null";
		System.out.println(a);
		System.out.println(b);
	}
}
