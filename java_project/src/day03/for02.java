package day03;

import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num = 6 의 약수 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(num+"의 약수 "+i);
			}
		}
		
		
	}

}
