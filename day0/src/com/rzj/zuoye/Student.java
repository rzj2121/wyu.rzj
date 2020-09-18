package com.rzj.zuoye;

import java.util.TreeSet;

public class Student implements Comparable<Student> {
	private int results;
	private String name;

	public Student(String name, int result) {
		super();
		this.results = result;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [result=" + results + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResults() {
		return results;
	}

	public void setResults(int result) {
		this.results = result;
	}

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student("张三", 90));
		ts.add(new Student("李四", 80));
		ts.add(new Student("王五", 60));
		ts.add(new Student("赵六", 50));
		for (Student student : ts) {
			System.out.println(student);
		}
	}

	@Override
	public int compareTo(Student o) {
		int big = this.getResults() - o.getResults();
		int length = big == 0 ? this.name.compareTo(o.name) : big;
		return big == 0 ? length : big;
	}

}
