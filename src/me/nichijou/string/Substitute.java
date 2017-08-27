package me.nichijou.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nichijou on 8/26/17.
 */
public class Substitute {
	public static void main(String[] args) {
		String str = "This is a great day, is it not? If there is something, THIS IS it. <b>is</b>";
//		Pattern pattern = Pattern.compile("[.>, ](is)[.<, ]", Pattern.CASE_INSENSITIVE);
//		Matcher matcher = pattern.matcher(str);
//		System.out.println(matcher.replaceAll("<h1>$1</h1>"));
		System.out.println(str.replaceAll("(?i)([.>, ])(is)([.<, ])","$1<h1>$2</h1>$3"));
		// str remain the same
		System.out.println(str);

		String orgLink = "please visit [[https://www.xvideos.com/actor?name=Kirara Asuka][Kirara Asuka'homePage]]";
		System.out.println(orgLink.replaceAll("\\[\\[(.+)\\]\\[(.+)\\]\\]","<a href=\"$1\">$2</a>"));

		String bold = "`something` =important= `should *be* *emphasized";
		System.out.println(bold.replaceAll("\\*(\\w+)\\*","<bold>$1</bold>").replaceAll("=(\\w+)=","<bold>$1</bold>").replaceAll("`(\\w+)`","<bold>$1</bold>"));
	}
}
