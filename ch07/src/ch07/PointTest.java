package ch07;

public class PointTest {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}

}

//class Point{
//	int x;
//	int y;
//	
//	Point(int x, int y){
//		this.x= x;
//		this.y= y;
//	}
//	
//	Point(){
//		this(0, 0);
//	}
//	
//	String getXY() {
//		return "("+x+","+y+")";
//	}
//	
//	String getLocaton() {
//		return "x :" + x + ",y :" + y; 
//	}
//}
//
//class Point3D extends Point{
//	int z;
//	
//	Point3D(int x, int y, int z) {
//		super();
//		this.x =x;
//		this.y =y;
//		this.z =z;
//	}
//	
//	String getLocaton() {
//		return "x :" + x + ",y :" + y + ", z:" +z; 
//	}
//}