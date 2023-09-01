package day12;

public class 상속 {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.setA(10);a.setB(20);a.setC(30);a.setNum(40);
		a.print();
		
		B b = new B();
		b.setA(100);b.setB(200);b.setC(300);b.setD(10);
		b.num=500; b.setE(20);b.setF(30);
		b.print();
	}

}

class A{
	private int a,b,c;
	protected int num;
	
	public void print() {
		System.out.println("a:"+a+"b:"+b+"c:"+c);
		System.out.println("num:"+num);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}


class B extends A{
	private int d,e,f;
	
//	public void print() {
//		super.print();
//		System.out.println("d:"+d+"e:"+e+"f:"+f);
//	}
	
	
	
	public int getD() {
		return d;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("d:"+d+"e:"+e+"f:"+f);
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
}