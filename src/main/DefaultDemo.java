package main;

interface Shape{
	void draw();
	default void paint(String color) {
		System.out.println(color+" color is painted");
	}
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		circle.draw();
		circle.paint("red");

	}

}
