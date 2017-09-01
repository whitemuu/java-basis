package me.nichijou.string;

/**
 * Created by nichijou on 8/31/17.
 */
public class SubString {
	public static void main(String[] args) {
		String classPath = "/var/lib/tomcat7/webapps/ROOT/WEB-INF/classes";
		System.out.println(classPath.substring(0, classPath.indexOf("/WEB-INF/classes")));
	}
}
