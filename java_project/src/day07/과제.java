package day07;

import java.util.Scanner;

public class 과제 {
	static Scanner scan = new Scanner(System.in);

	int[] getNum() {
		System.out.println("첫번째 숫자 입력:");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자 입력:");
		int num2 = scan.nextInt();
		int[] arr = { num1, num2 };
		return arr;
	}		

	int choice() {
		System.out.println("원하는 계산 선택");
		System.out.println("1:더하기 2:빼기 3:곱하기 4:나누기 5:나머지구하기");
		return scan.nextInt();
	}

	void calculator() {
		int[] arr = getNum();
		switch (choice()) {
		case 1:
			sum(arr);
			break;
		case 2:
			sub(arr);
			break;
		case 3:
			mul(arr);
			break;
		case 4:
			div(arr);
			break;
		case 5:
			rem(arr);
			break;
		}

	}

	void sum(int[] arr) {
		System.out.println(arr[0] + "+" + arr[1] + "=" + (arr[0] + arr[1]));
	}

	void sub(int[] arr) {
		System.out.println(arr[0] + "-" + arr[1] + "=" + (arr[0] - arr[1]));
	}

	void mul(int[] arr) {
		System.out.println(arr[0] + "*" + arr[1] + "=" + (arr[0] * arr[1]));
	}

	void div(int[] arr) {
		double div = (double) arr[0] / arr[1];
		System.out.println(arr[0] + "/" + arr[1] + "=" + div);
	}

	void rem(int[] arr) {
		System.out.println(arr[0] + "%" + arr[1] + "=" + (arr[0] % arr[1]));
	}

	public static void main(String[] args) {
		과제 rhkwp = new 과제();
		rhkwp.calculator();
	}

}
