package Shape;

public class Rect extends Shape implements Drawable {
	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

}
