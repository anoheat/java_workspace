package day04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do{
		// 실행문
		// }while(조건식);
		// do while은 일단 실행하고 조건식비교라서 무조건 1번은 실행
		
		Scanner sc = new Scanner(System.in);
		
		/* 메뉴1.저장하기
		 * 메뉴2.새로만들기
		 * 메뉴3.종료하기
		 */
		
		int menu = 0;
		
		do {
			System.out.println("---menu---");
			System.out.println("1.저장하기");
			System.out.println("2.새로만들기");
			System.out.println("3.종료하기");
			System.out.println(">메뉴입력 :");
			
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				//실제 기능
				System.out.println("저장합니다.");
				break;
			case 2:
				//실제 기능
				System.out.println("새로만듭니다.");
				break;
			case 3:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu!=3);
		System.out.println("프로그램 종료");

	}

}
