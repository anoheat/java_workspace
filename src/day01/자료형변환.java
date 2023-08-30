package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		// casting
		byte num = 10;
		int num1 = num;
		
		double num2 = 10.4;
		num1 = (int)num2 ;
		
		System.out.println(num1);
		
		int num3 = (int)1.2;
		System.out.println(num3);
		
		
		int kor = 81, eng = 79, math = 81;
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println((avg>=80)? "결과 : 합격" : "결과 : 불합격");
			
	}

}
