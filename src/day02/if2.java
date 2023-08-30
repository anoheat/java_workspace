package day02;

import java.util.Scanner;

public class if2 {

	public static void main(String[] args) {
		// 국어 영어 수학 점수 입력받아서 합계 평균 평가 출력
		// 평가는 평균이 90 이상이면 a 80이상이면 b 70이상이면 c 나머지는d
		// 입력값이 0보다 100보다 크면 잘못된 값입니다 출력

		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int point = scan.nextInt();
		if(point<0 || point>100) {
			System.out.println("잘못된 값입니다.");
			scan.close();
		}else {
		int kor = point;
		
		System.out.println("영어 점수 입력");
		point = scan.nextInt();
		if(point<0 || point>100) {
			System.out.println("잘못된 값입니다.");
			scan.close();
		}else {		
		int eng = point;
		
		System.out.println("수학 점수 입력");
		point = scan.nextInt();
		if(point<0 || point>100) {
			System.out.println("잘못된 값입니다.");
			scan.close();
		}else {		
		int math = point;
		
		
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if(avg>=90) {
			System.out.println("평가 : A");
		}else if(avg>=80) {
			System.out.println("평가 : B");
		}else if(avg>=70) {
			System.out.println("평가 : C");
		}
		
			System.out.println("평가 : D");
		
				
		
		}
		}
		}
	}
}
