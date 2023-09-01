package day08;

public class Class01 {

	public static void main(String[] args) {
		//
		Point p = new Point();
		p.x=10;
		p.y=5;
		p.print();
		
	}

}

//
class Point {
	// 멤버변수
	int x;
	int y;

	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
}