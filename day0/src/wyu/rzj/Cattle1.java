package wyu.rzj;

public class Cattle1 extends Animal {
	public void getFatherDate() {
		System.out.println(super.name);
		super.move();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cattle1 cattle1=new Cattle1();
		cattle1.getFatherDate();
	}

}
