package Shape;

public class ShapeTest {
	public static void main( String[] args) {      
	      Rect rect = new Rect();
	      Circle circle = new Circle();
	      Triangle triangle = new Triangle();
	      
	      rect.setHeight(2);
	      rect.setWidth(5);
	      
	      circle.setRadius(5);
	      
	      triangle.setHeight(4);
	      triangle.setWidth(5);
	      
	      System.out.println(rect.calculateArea());
	      System.out.println(circle.calculateArea());
	      System.out.println(triangle.calculateArea());
	      
	  }

}
