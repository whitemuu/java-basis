package me.nichijou.classfileformat;

/**
 * Created by nichijou on 8/23/17.
 */
public class AttributeInnerClass {
	static class TheNestedClass{}
	class TheInnerClass{}
	void method(){
		new TheInnerClass(){};
	}
}
