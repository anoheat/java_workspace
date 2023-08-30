package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 소수 : 약수가 1과 나 자신의 수만 가지는 수
		 * 3 5 7 11 13 17 19....
		 * num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num = 13 => 소수입니다.
		 * 	   num = 12 => 소수가 아닙니다.
		 */
		Scanner scan = new Scanner(System.in);
		
//		int num1 = scan.nextInt();
//		int num2 = 0;
//		for(int i=1;i<=num1;i++) {
//			if(num1%i==0) {
//				num2 = num2+1;
//			}
//			if(i==num1) {
//				if(num2==2) {
//					System.out.println(num1+" => 소수입니다.");
//					num2 = 0;
//					i = 0;
//					num1=scan.nextInt();
//				}else {
//					System.out.println(num1+" => 소수가 아닙니다.");
//					num2 = 0;
//					i = 0;
//					num1=scan.nextInt();
//				}
//				
//			}
//			
//			
//		}
		int count = 0;
		for(int num1=1;num1<=100;num1++) {
			for(int num2=1;num2<=num1;num2++) {
				if(num1%num2==0) {
					count = count+1;
				}if(num1==num2) {
					if(count==2) {
					System.out.print(num1+" ");
					}
					count = 0;
				}
			}
			
		}
		
			
		
		
	}

}
