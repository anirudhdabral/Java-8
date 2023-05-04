package main;

interface Vehicle{
	void start();
	void stop();
	static String getModel() {
		return "2022";
	}
}

class Bike implements Vehicle{
	public void start() {
		System.out.println("Bike is started");
	}
	public void stop() {
		System.out.println("Bike is stopped");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Vehicle vehicle = new Bike();
		vehicle.start();
		vehicle.stop();
		System.out.println(Vehicle.getModel());
		

	}

}
