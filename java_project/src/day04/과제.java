package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명의 점수를 입력받아서 배열에 저장하고, 점수의 합계와 평균을 출력
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		int worst=100;
		for(int i=0;i<5;i++) {
			System.out.println("점수를 입력하세요 ["+(i+1)+"/5]");
			arr[i] = scan.nextInt();
			sum = sum + arr[i];
			if(arr[i]<worst) {
				worst = arr[i];
			}
		}
		double avg=sum/5.0;
		System.out.println("합계 : "+sum+"점");
		System.out.printf("%s%.1f%s%n","평균 : ",avg,"점");
		System.out.println("최하점 : "+worst+"점");
	}

}
