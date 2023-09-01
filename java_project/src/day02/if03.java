package day02;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//수를 입력 받아서 2의 배수가 맞으면 2의 배수입니다.
		//3의 배수가 맞으면 3의배수입니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수를 입력하세요.");
		int num1 = scan.nextInt();
		if(num1%2 ==0 && num1%3 ==0) {
			System.out.println("6의 배수입니다.");
		}
		if(num1%2==0) {
			System.out.println("2의 배수입니다.");
		}else if(num1%3==0) {
			System.out.println("3의 배수입니다.");
		}
		scan.close();
		
		
	}

}
