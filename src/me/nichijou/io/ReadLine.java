package me.nichijou.io;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by nichijou on 9/1/17.
 */
public class ReadLine {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("hello wordzzz".getBytes())));
		char[] buf = new char[50];
		int num = bufferedReader.read(buf);
		System.out.println(num);
		System.out.println(new String(Arrays.copyOfRange(buf,0,num)));
	}
}
