package com.rzj.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		collection.add("aaa");
		collection.add("qqq");
		collection.add("ddd");
		collection.add("ccc");
		collection.add("www");
		Iterator<String> iterator=collection.iterator();
		while (iterator.hasNext()) {
			
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("--------------");
		collection.add("asd");
		Iterator<String> iterator1=collection.iterator();
		while (iterator1.hasNext()) {
			
			String string = (String) iterator1.next();
			System.out.println(string);
		}
//	for (String string : collection) {
//		System.out.println(string);
//	}
		
	}
}
