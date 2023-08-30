package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카페에 제출
		// 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		// 연산자는 + - * / %
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int a = scan.nextInt();
		System.out.println("두번째 정수 입력");
		int b = scan.nextInt();
		System.out.println("연산 기호 입력(+ - * / %)");
		String c = scan.next();
		
		switch(c){
		case "+" :
			sum = a+b;
			System.out.println(a+"+"+b+"="+sum);
			break;
		case "-" :
			sum = a-b;
			System.out.println(a+"-"+b+"="+sum);
			break;
		case "*" :
			sum = a*b;
			System.out.println(a+"*"+b+"="+sum);
			break;	
		case "/" :
			sum = a/b;
			System.out.println(a+"/"+b+"="+sum);
			break;
		case "%" :
			sum = a%b;
			System.out.println(a+"%"+b+"="+sum);
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
		scan.close();
		
		
		
	}

}
