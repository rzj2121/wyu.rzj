package com.rzj.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("0001", "aaaa");
		hashMap.put("0002", "bbbb");
		hashMap.put("0003", "cccc");
		hashMap.put("0004", "dddd");
		hashMap.put("0005", "eeee");
		// ��ȡֵ
//		Collection<String> values = hashMap.values();//��ȡֵ
//		System.out.println(values);

		// ��ȡ��
//		Set<String> keySet = hashMap.keySet();
//		System.out.println(keySet);

		// ��ȡ��ֵ
		Set<Entry<String, String>> entrySet = hashMap.entrySet();
		System.out.println(entrySet);
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
		}

	}

}
