package com.rzj.collection;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		HashSet<String> hashSet = new HashSet<String>();
		hs.add("111");
		hs.add("222");
		hashSet.add("333");
		hashSet.add("444");
		hs.add(hashSet);
		System.out.println(hs.add("111"));
		for (Object object : hs) {
			System.out.println(object);
		}

	}
}
