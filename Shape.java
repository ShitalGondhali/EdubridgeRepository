
public class Shape {
	private int length;
	private int breadth;
	private int area;
	static int count=0;
	Shape(int length,int breadth)
	{      
		this.length=length;
		this.breadth=breadth;     
		count=count+1;
	}
	public void findArea()
	{
		area=length*breadth;
	}
	@Override
	public String toString() {
		return "Shape [length=" + length + ", breadth=" + breadth + ", area=" + area + "]";
	}

}
       