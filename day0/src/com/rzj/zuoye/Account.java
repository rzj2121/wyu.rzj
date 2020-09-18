package com.rzj.zuoye;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Account {
	private long id;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String password;

	public Account(double balance, String password) {

		this.balance = balance;
		this.password = password;
		this.id = this.hashCode();
	}

	public static void main(String[] args) {
		List<Account> list = new ArrayList();
		list.add(new Account(10.00, "1234"));
		list.add(new Account(20.00, "5678"));
		list.add(new Account(0, "1010"));

		HashMap<Long, Account> map = new HashMap<>();
		;
		for (Account account : list) {
			map.put((account).getId(), account);
		}

		Set<Long> keys = map.keySet();
		for (Long key : keys) {
			Account account = map.get(key);
			System.out.println("id:" + account.getId() + "  balance£º" + account.getBalance());
		}

	}

//	private long id;
//	private double balance;
//	private String password;
//
//	public Account() {
//
//	}
//
//	public Account(double balance, String password) {
//		super();
//		this.balance = balance;
//		this.password = password;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public static void main(String[] args) {
//		List<Account> list = new ArrayList<>();
//		list.add(new Account(10.00, "1234"));
//		list.add(new Account(15.00, "5678"));
//		list.add(new Account(0, "1010"));
//		HashMap map = new HashMap();
//		
//}

}
