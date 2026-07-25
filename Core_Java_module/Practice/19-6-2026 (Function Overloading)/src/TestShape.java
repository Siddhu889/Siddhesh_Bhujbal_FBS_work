class Shape
{
	void calcArea(Triangle t)
	{
		double area=0.5*(t.getBase()*t.getHeight());
		System.out.println("Area OF Triangle is :"+area);
	}
	void calcArea(Rectangle r)
	{
		double area=r.getLength()*r.getBreadth();
		System.out.println("Area Of Rectangle is :"+area);
	}
	void calcArea(Circle c)
	{
		double area=3.14*c.getRadius()*c.getRadius();
		System.out.println("Area Of Circle is :"+area);
	}
}//class shape ends here

class Triangle
{
	double base,height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle() {
		this.base = 0;
		this.height = 0;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}//class Triangle ends here

class Rectangle
{
	double length,breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
}//class Rectangle ends here

class Circle
{
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		this.radius = 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}//class circle ends here

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape s1 = new Shape();
        Triangle t1 = new Triangle(5,10);
        s1.calcArea(t1);
        Circle c1 = new Circle(10);
        s1.calcArea(c1);
        Rectangle r1 = new Rectangle(5,2);
        s1.calcArea(r1);

	}//main ends here
}//class TestShape ends here
