package day06;

import java.util.Scanner;

public class 과제 {
	int computer() {
		int a = (int)Math.random()*2;
		return a;
	}
	
	int me() {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 바위 보 선택");
		String me = scan.next();
		int b = 0;
		switch(me) {
		case "가위":
			b = 0;
			break;
		case "바위":
			b = 1;
			break;
		case "보":
			b = 2;
			break;
		default :
			System.out.println("잘못된 입력");
			me();
		}
		return b;
	}
	
	void battle(int num1,int num2) {
		if(num1==num2) {
			System.out.println("무승부");
			return;
		}
		switch(num1){
		case 0:
			if(num2==1) {
				System.out.println("컴퓨터 : 바위");
				System.out.println("패배");
			}else {
				System.out.println("컴퓨터 : 보");
				System.out.println("승리");
			}
		case 1:
			if(num2==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("승리");
			}else {
				System.out.println("컴퓨터 : 보");
				System.out.println("패배");
			}
		case 2:
			if(num2==0) {
				System.out.println("컴퓨터 : 가위");
				System.out.println("패배");
			}else {
				System.out.println("컴퓨터 : 바위");
				System.out.println("승리");
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// 컴퓨터가 가위바위보 선택 (0가위 1바위 2보)


	}

}
