package day06;

import java.util.Scanner;

public class Method03 {
	void plus(int num1,int num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	void minus(int num1,int num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
	}
	void gop(int num1,int num2) {
		System.out.println(num1 + "*" + num2 + "=" + num1*num2);
		
	}
	void na(int num1,int num2) {
		System.out.println(num1 + "/" + num2 + "=" + (double)num1/num2);
	}
	void nam(int num1,int num2) {
		System.out.println(num1 + "%" + num2 + "=" + num1%num2);
	}
	void cal() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력[1/2]");
		int num1 = scan.nextInt();
		System.out.println("정수 입력[2/2]");
		int num2 = scan.nextInt();
		System.out.println("연산기호 입력");
		String str = scan.next();
		switch(str) {
		case "+":
			plus(num1,num2);
			break;
		case "-":
			minus(num1,num2);
			break;
		case "*":
			gop(num1,num2);
			break;
		case "/":
			na(num1,num2);
			break;
		case "%":
			nam(num1,num2);
			break;
		default :
			System.out.println("잘못된 입력");
			cal();
		}
	}
	
	double[] rem2(int num1,int num2) {
		double[] rem = new double[2];
		rem[0] = (double)num1/num2;
		rem[1] = num1%num2;
		return rem;
		
	}
	
	
	public static void main(String[] args) {
		// 메서드를 활용한 계산기 
		// 연산자 + - * / %만 허용
		// 두 수와 연산자를 입력받아서 메서드를 활용하여 연산
		Method03 me = new Method03();
//		me.cal();

		//두 정수 입력받아 몫과 나머지 double[]로 리턴
		//리턴타입 double타입배열
		//매개변수 두정수
		//변수명rem2
		double rem[] = me.rem2(51, 5);
		System.out.println("몫 : "+rem[0]);
		System.out.println("나머지 : "+rem[1]);
		
		
		
		

	}

}
