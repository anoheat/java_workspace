package day08;

public class MethodOverloading {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	//가변길이 메서드
	// 피연산자의 값이 일정하지 않을 경우, 매개변수의 개수와 상관없이 매개값을 줄때 이용
	int sum1(int ...num) {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+= num[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.sum(1, 2,3);
		int sum = m.sum1(1,2,3,4,5,6,7,8,9,10);
		System.out.println(sum);
		
	}
}
