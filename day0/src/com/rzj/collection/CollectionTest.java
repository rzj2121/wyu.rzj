package com.rzj.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {

	public static void main(String[] args) {
		Collection collection=new ArrayList();
		show(collection);
		

	}
	private static void show(Collection collection) {
		collection.add("aaa");
		collection.add("bbb");
		collection.add("ccc");
		collection.add("ddd");
		System.out.println("≤‚ ‘collection:"+collection);
		} 
	
		
	
}
