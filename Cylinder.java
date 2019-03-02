package Circle;

public class Cylinder extends Circle
{
	private double height = 1;
	public Cylinder(){}
	public Cylinder(double radius, String color)
	{
		super(radius,color);
	}
	public Cylinder(double radius, String color, double height)
	{
		super(radius,color);
		this.height = height;
	}
	public double getHeight()
	{
		return this.height;
	}
	@Override
	public double getArea() {
		return super.getPerimeter() * height;
	}
	//the tich
	public double getVolume()
	{
		return super.getArea() * height;
	}
	@Override
	public String toString()
	{
		return "which is a subclass of " + super.toString() + "\nheight" + getHeight()
			+ "\nVolume " + getVolume();
	}
}
