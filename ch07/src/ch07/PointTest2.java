package ch07;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}

}


class Point{
	int x=10;
	int y=20;
	
	Point(int x, int y){
		this.x= x;
		this.y= y;
	}
	
	Point(){
		this(0, 0);
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}

}

class Point3D extends Point{
	int z=30;
	
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z =z;
	}
	public Point3D() {
		this(100, 200, 300);
	}
	
	String getLocaton() {
		return "x :" + x + ",y :" + y + ", z:" +z; 
	}
}