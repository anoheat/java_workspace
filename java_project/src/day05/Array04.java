package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// 5자리의 숫자를 입력 받아서 입력받은 숫자를 거꾸로 출력/각 자리의 합계 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("5자리 숫자 입력");
		int num1 = scan.nextInt();
		int[] arr1 = new int[5];
		int num2 = 0;
		int sum = 0;
		for(int i=0;i<5;i++) {
			switch(i) {
			case 0:
				num2=num1%10;
				break;
			case 1:
				num2=num1%100/10;
				break;
			case 2:
				num2=num1%1000/100;
				break;
			case 3:
				num2=num1%10000/1000;
				break;
			case 4:
				num2=num1/10000;
				break;
			}
			arr1[i] = num2;
			sum = sum+arr1[i];
		}
		System.out.println("입력받은 수 : "+num1);
		System.out.print("거꾸로 출력 : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		System.out.println("합계 : "+sum);		
	}

}
