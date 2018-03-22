package Pack1;

public class Polygon {
	protected int width;
	protected int height;
	
	public void set_values(int w,int h) {
		
		width=w;
		height=h;
	}
	public void main (String []args) {
		Rectangle rec=new Rectangle();
		Triangle tri =new Triangle();
		rec.set_values(12, 16);
		tri.set_values(15, 25);
		System.out.println(rec.area());
		System.out.println(tri.area());
	}
}
