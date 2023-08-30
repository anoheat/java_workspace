package day02;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 콘솔 입력 Scanner 클래스
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int num = scan.nextInt();
//		if(num%2==0) {
//			System.out.println(num+" : 짝수");
//			
//		}else {System.out.println(num+" : 홀수");		
//		
//		}
//		
//				
//		scan.close();
		
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("정수를 입력하세요.");
//		int num = scan.nextInt();
//	
//		
//		if(num>0) {
//			System.out.println("양수");
//		}else if(num==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("음수");
//		}
//		
//		System.out.println("--------------");
//		System.out.println("실수 입력");
//		double num3 = scan.nextDouble();
//		
//		System.out.println("실수"+num3);
//		System.out.println("한글자 입력");
//		//next() : 문자열 / charAt(index) : 문자열중 index번지 한글자 추출
//		//index번지는 0부터 시작
//		char ch = scan.next().charAt(0);
//		System.out.println("한글자 "+ch);
		
		//문자열 입력: next() 공백포함안됨
//		
		System.out.println("문자열 >");
		String s = scan.next();
		System.out.println("문자열 > "+s);
		scan.nextLine();
		
//		여러 문자 입력 : nextlLine() 공백포함
		
		System.out.println("여러 문자 >");
		String str = scan.nextLine();
		System.out.println("여러문자 > "+str);
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
