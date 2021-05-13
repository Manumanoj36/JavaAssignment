abstract class Shape {
abstract void draw();
}
class Line extends Shape
{
	void draw()
	{
		System.out.println("Drawing Line...");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}
class Cube extends Shape
{
	void draw()
	{
		
		System.out.println("Drawing Cube...");
	}
	public static void main(String[] args)
	{
		Shape l = new Line();
		l.draw();
		Shape r = new Rectangle();
		r.draw();
		Shape c = new Cube();
		c.draw();
	}
}
