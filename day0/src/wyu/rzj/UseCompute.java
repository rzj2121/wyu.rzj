package wyu.rzj;

import java.util.Scanner;

public class UseCompute {
	public void useCom(Compute com,int one,int two) {
		if(com.equals("+")) {
			addImpl add=new addImpl();
			add.computer(one,two);
		}
	}
	public static void main(String[] args) {
		UseCompute uc=new UseCompute();
		
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine();

	}
}
