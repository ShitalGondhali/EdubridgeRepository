
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape shape =new Shape(12,14);
      shape.findArea();
      System.out.println(shape);

      Shape shape2 =new Shape(10,8);     
      shape2.findArea();
      System.out.println(shape2);
      
      Shape shape3=new Shape(20,25);
      shape3.findArea();
      System.out.println(shape3);
      System.out.println("Total no. of shape objects are:"+Shape.count);
	}

}