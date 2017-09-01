package me.nichijou.collection;

import java.util.*;

/**
 * Created by nichijou on 8/27/17.
 */
public class RemoveItemWhileItering {
	public static void main(String[] args) {
//		只能使用迭代器 otherwise ConcurrentModificationException
		List<String> list = new LinkedList<>();
		list.add("haha");
		list.add("hehe");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (next == "haha") {
				iterator.remove();
			}
		}
		System.out.println(list);
	}
}
