package day04;

import java.util.Scanner;

public class Break01 {

	
	public static void main(String[] args) {
	//break 자기꺼만 탈출
	//a: for(){}   이름붙여주기
	//break a;     a빠져나가기
		
		
		//1~10출력
		//조건식 생략 break이용해서 10되면 벗어나게
//		
//		for(int i=1; ; i++) {
//			System.out.print(i+" ");
//			if(i==10) {
//				break;
//			}
//		}
		
		
		//한글자 입력받아서 글자를 그대로 출력
		//y 입력받으면 종료
		Scanner scan = new Scanner(System.in);
		for(char a;;) {
			a = scan.next().charAt(0);
			if(a=='y') {
				break;
			}else {
				System.out.println(a);
			}
		}
					
		
		
	}
}
