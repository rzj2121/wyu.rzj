package com.rzj.collection;

import java.util.TreeSet;

public class ComparablePerson implements Comparable<ComparablePerson> {
	private String name;
	private int age;

	public ComparablePerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparablePerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(ComparablePerson o) {
		int length = this.name.length() - o.name.length();// �Ƚϳ���Ϊ��Ҫ����
		int num = length == 0 ? this.name.compareTo(o.name) : length;// �Ƚ����ݴ�Ҫ
		return num == 0 ? this.age - o.age : num;// �Ƚ�����Ϊ��Ҫ����
	}

	@Override
	public String toString() {
		return "ComparablePerson [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		TreeSet<ComparablePerson> ts = new TreeSet<>();
		ts.add(new ComparablePerson("����", 23));
		ts.add(new ComparablePerson("����", 13));
		ts.add(new ComparablePerson("����", 13));// ���˴������ĸĳɺ��������ֲ�ͬ����
		ts.add(new ComparablePerson("����", 43));
		ts.add(new ComparablePerson("����", 33));
//		System.out.println(ts);
		for (ComparablePerson comparablePerson : ts) {
			System.out.println(comparablePerson);
		}
	}

}