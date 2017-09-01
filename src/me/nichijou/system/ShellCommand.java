package me.nichijou.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by nichijou on 8/27/17.
 */
public class ShellCommand {
	public static void main(String[] args) throws IOException, InterruptedException {
//		Process pwd = Runtime.getRuntime().exec("pwd");
		Process ls = Runtime.getRuntime().exec("ls -lh");
		ls.waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(ls.getInputStream()));
		String stdout;
		while ((stdout = reader.readLine()) != null) {
			System.out.println(stdout);
		}
	}
}
