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
		System.out.println("我已经开动");
	}
	public void showInfo() {
		System.out.println("商标:"+brand);
		System.out.println("颜色:"+color);

	}
	
}
