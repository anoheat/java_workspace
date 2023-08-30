package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// up/down게임 
		// 1~50사이의 랜덤수를 생성하여 맞추는 게임
		// 컴퓨터가 랜덤 수 생성 : 35 , 내가 입력한 수:10 / up 출력
		// 20입력 up 출력, 40입력 down출력  ,35입력 정답
		Scanner scan = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*50)+1;
		System.out.println("수 입력");
		
		
		for(;;){
			int num2 = scan.nextInt();
			if(num2==num1){
				System.out.println("정답");
				break;				
			}else if(num2<num1){
				System.out.println("up");
			}else{
				System.out.println("down");		
			}
		}
		scan.close();
		
		

	}

}
