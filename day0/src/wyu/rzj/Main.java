package wyu.rzj;

public class Main {
	public static void main(String[] args) {
		Car c=new Car(4,"benz","black");
		c.run();
		c.showInfo();
		c.showCar();
		System.out.println("-----------------");

		Truck t=new Truck(2.0f,"BOMAG","red");
		t.run();
		t.showInfo();
		t.showTruck();
	}
	
}
