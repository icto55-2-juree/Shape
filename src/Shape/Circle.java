package Shape;

public class Circle extends Shape implements Drawable{

	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(){
		System.out.println("원을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}

	
	
	
}