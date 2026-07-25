abstract class Shape
{
	double area;

	public Shape() {
		super();
		this.area = 12;
	}
	
	public Shape(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	//Polymorphic behavior
	abstract void calcarea();
	
	void display()
	{
		System.out.println("Area:"+this.area);
	}
}//Shape class ends here

class Triangle extends Shape
{
	double base,height;

	public Triangle() {
		super();
		this.base = 5;
		this.height = 10;
	}
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
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
	
	//Polymorphic behavior
	void calcarea()
	{
		this.area = 0.5*this.height*this.base;
	}
	
	void display()
	{
		super.display();
		System.out.println("Base:"+this.base);
		System.out.println("Height:"+this.height);
		System.out.println("Area Of Triangle:"+this.area);
		System.out.println();
	}
	
}//Triangle class ends here

class Rectangle extends Shape
{
	double length,breadth;

	public Rectangle() {
		super();
		this.length = 10;
		this.breadth = 5;
	}
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
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
	
	//Polymorphic behavior
	void calcarea()
	{
		this.area = this.length * this.breadth;
	}
	
	void display()
	{
		super.display();
		System.out.println("Length:"+this.length);
		System.out.println("Breadth:"+this.breadth);
		System.out.println("Area Of Rectangle:"+this.area);
		System.out.println();
	}

}//Rectangle class ends here

class Circle extends Shape
{
	double radius;

	public Circle() {
		super();
		this.radius = 5;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Polymorphic behavior
	void calcarea()
	{
		this.area = Math.PI * this.radius * this.radius;
	}
	
	void display()
	{
		super.display();
		System.out.println("Radius:"+this.radius);
		System.out.println("Area Of Circle:"+this.area);
		System.out.println();
	}
}//Circle ends here

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Shape s1;
         
//         s1 = new Shape();
//         s1.calcarea(); 
//         s1.display();
         
         s1 = new Triangle(10,5);
         s1.calcarea();
         s1.display();
         
         s1 = new Rectangle(5,5);
         s1.calcarea();
         s1.display();
         
         s1 = new Circle(10);
         s1.calcarea();
         s1.display();
         
	}//main ends here

}//class TestShape ends here

