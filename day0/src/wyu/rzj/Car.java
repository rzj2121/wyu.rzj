package wyu.rzj;

public class Car extends Vehicle {
	private int seats;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(int seats,String brand,String color) {
		super(brand,color);
		this.seats=seats;
		
	}
	public void showCar() {
		System.out.println("×ùÎ»£º"+seats);
		
	}
}
