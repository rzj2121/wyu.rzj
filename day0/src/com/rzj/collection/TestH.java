package com.rzj.collection;

public class TestH {
	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object.hashCode());
		Integer integer = object.hashCode();
		System.out.println(integer.toBinaryString(integer));
	}
}
