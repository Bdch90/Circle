package Circle;

public class Circle
{
	private double radius = 1;
	private String color = "blue";
	public Circle () {}
	public Circle (double radius)
	{
		this.radius = radius;
	}
	public Circle (double radius, String color)
	{
		this.color = color;
		this.radius = radius;
	}
	public double getRadius ()
	{
		return this.radius;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setRadius (double radius)
	{
		this.radius = radius;
	}
	public double getArea ()
	{
		return this.radius * this.radius * Math.PI;
	}
	public double getPerimeter ()
	{
		return this.radius * 2 * Math.PI;
	}

	public String toString () {
		return "Circle\nradius : " + getRadius () + "\ncolor : " + getColor() + "\nArea " + getArea();
	}

}
