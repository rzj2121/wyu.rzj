package wyu.rzj;

public class Vehicle {
	private String brand;
	private String color;
	public Vehicle() {}
	
	public Vehicle(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}

	public void run() {
		System.out.println("���Ѿ�����");
	}
	public void showInfo() {
		System.out.println("�̱�:"+brand);
		System.out.println("��ɫ:"+color);

	}
	
}
