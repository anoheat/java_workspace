package day09;

public class MethodEx02 {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx02 me = new MethodEx02();
		
		me.div(10,20);
		
	}
	void sum(int num1, int num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	void sub(int num1, int num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	void mul(int num1, int num2) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	void div(int num1, int num2) {
		System.out.println(num1+"/"+num2+"="+((double)num1/num2));
	}
	void rem(int num1, int num2) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}
	
	
	
	
	
}
