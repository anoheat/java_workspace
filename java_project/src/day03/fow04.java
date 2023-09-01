package day03;

import java.util.Scanner;

public class fow04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 입력");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 입력");
		int num2 = scan.nextInt();
		int num3 = 0;
		for(int i=1;i<=num1;i++){
			if(num1%i==0 && num2%i==0) {
				num3 = i;
			}
		}
		System.out.println("최대 공약수는 "+num3);
			
		
		
		
		
		
		
		
	}

}
