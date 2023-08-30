package day07;

import java.util.Scanner;

public class Method07 {
	void print(int num,String str) {
		for(int i=1;i<=num;i++) {
			System.out.print(str);
		}
	}
	
	public static void main(String[] args) {
		// 숫자와 기호를 주고 기호를 숫자만큼 출력하는 메소드
		// 숫자3 기호* = ***
		Method07 me = new Method07();
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력:");
		String str = sc.next();
		System.out.println("반복 횟수:");
		int num = sc.nextInt();
		me.print(num, str);
		
		
		

	}

}
