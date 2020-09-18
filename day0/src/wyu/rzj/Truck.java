package wyu.rzj;

public class Truck extends Vehicle {
	private float load;

	public Truck(float load,String brand,String color) {
		super(brand,color);
		this.load = load;
	}
	public void showTruck() {
		System.out.println("дижи"+load);
	}
	
}
