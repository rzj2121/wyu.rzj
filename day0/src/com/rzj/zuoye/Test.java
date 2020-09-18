package com.rzj.zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();
		list.add(new Account(10.00, "1234"));
		list.add(new Account(15.00, "5678"));
		list.add(new Account(0, "1010"));
		HashMap map = new HashMap();
		for (int i = 0; i < list.size(); i++) {
			map.put(i, list.get(i));
		}
		Set entrySet = map.entrySet();
		System.out.println(entrySet);
//		for(Object object:entrySet) {
//			
//		}

	}
}
