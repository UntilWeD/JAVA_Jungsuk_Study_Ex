//package ch07_test;
//
//abstract class Shape {
//	Point p;
//	
//	Shape() {
//		this(new Point(0,0));
//	}
//	Shape(Point p) {
//		this.p = p;
//	}
//	
//	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
//	
//	Point getPosition() {
//		return p;
//	}
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//class Point {
//	int x;
//	int y;
//	
//	Point() {
//		this(0,0);
//	}
//	Point(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
//	
//	public String toString() {
//		return "["+x+","+y+"]";
//	}
//}
//
//class Circle extends Shape{
//	double r;
//	
//	Circle(){
//		super();
//		r=2;
//	}
//	
//	double calcArea() {
//		return Math.pow(r, 2);
//	}
//}
//
//class Rectangle extends Shape{
//	double width;
//	double height;
//	
//	double calcArea() {
//		return width*height;
//	}
//	
//	boolean isSquare() {
//		if(width == height)
//			return true;
//		else
//			return false;
//	}
//}
//
//public class Exercise7_22 {
//
//	public static void main(String[] args) {
//		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
//		System.out.println("면적의 합:"+sumArea(arr));
//
//	}
//
//}
