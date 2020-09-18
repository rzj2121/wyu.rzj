package com.rzj.collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "aaaa");
		treeMap.put(3, "bbb");
		treeMap.put(2, "ccc");
		treeMap.put(4, "dddd");
//		Set<Entry<String, String>> entrySet = treeMap.entrySet();
		Iterator<Integer> iterator = treeMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next + "," + treeMap.get(next));

		}
	}
}
