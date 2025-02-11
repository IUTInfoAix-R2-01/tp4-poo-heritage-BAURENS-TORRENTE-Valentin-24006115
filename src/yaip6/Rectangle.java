package yaip6;

public class Rectangle implements GeometricObject{
	private double width;
	private double length;
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	@Override
	public double getArea() {
		return width * length;
	}
	@Override
	public double getPerimetre() {
		return 2 * (width + length);
	}
	
	
	
}
