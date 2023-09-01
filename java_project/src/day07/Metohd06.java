package day07;

import java.util.Scanner;

public class Metohd06 {
	void gugudan(int num) {
		System.out.println(num+"단");
		for(int i=1;i<10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
	public static void main(String[] args) {
		// 구구단 출력
		Metohd06 me = new Metohd06();
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력");
		int dan = sc.nextInt();
		me.gugudan(dan);
		
		// 모든 단 출력
		for(int i=2;i<10;i++) {
			me.gugudan(i);
		}
		

	}

}
