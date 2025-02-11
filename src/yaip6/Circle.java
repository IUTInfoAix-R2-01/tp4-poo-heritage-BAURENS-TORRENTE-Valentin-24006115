package yaip6;

public class Circle implements GeometricObject {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimetre() {
		return 2 * Math.PI * radius;
	}
	
	
	
	
}
