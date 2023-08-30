package day06;

public class Method02 {
	void plus(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	void minus(int num1,int num2) {
		System.out.println(num1-num2);
	}
	int gop(int num1,int num2) {
		return num1*num2;
		
	}
	double na(int num1,int num2) {
		return (double)num1/num2;
	}
	int nam(int num1,int num2) {
		return num1%num2;
	}
	
	
	public static void main(String[] args) {
		// 메서드 활용해서 계산기 만들기
		// 메서드는 + - * / %
		// 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		// +- 메인출력 / */% 메서드출력
		
		
		Method01.sum(1,2);
		
		System.out.println();
		
	}

}
