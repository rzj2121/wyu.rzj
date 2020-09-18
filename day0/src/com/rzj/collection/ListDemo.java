package com.rzj.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		System.out.println("1----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("2---------------");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("3-------------------");
		Iterator iterator=list.listIterator();
		while (iterator.hasNext()) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		
	}

}
