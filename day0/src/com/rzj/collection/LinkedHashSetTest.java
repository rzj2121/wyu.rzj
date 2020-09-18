package com.rzj.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		HashSet hs = new LinkedHashSet();
		hs.add("456");
		hs.add("123");
		hs.add("234");
		hs.add("345");

		for (Object object : hs) {
			System.out.println(object);
		}
	}
}
