package yaip6;

public class Circle2 implements GeometricObject {
	protected double radius;

	public Circle2(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle2 [radius=" + radius + "]";
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
