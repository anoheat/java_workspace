package day02;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		
		if(num>0) {
			System.out.println("양수");
			
		}else {System.out.println("음수");
		
		}
		
		if(num>0) {
			System.out.println("양수");
			
		}else if(num==0) {
			System.out.println("0");
			
		}else {System.out.println("음수");
		}
		
		
		num = 15;
		
		if(num>10) {
			System.out.println("10보다큼");
	
		}else if(num>0) {
			System.out.println("양수");
		}
		else if(num==0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
	
		
		
		int num2;
		num2 = 4;
		if(num2%2==0) {
			System.out.println(num2+" : 짝수");
			
		}else { System.out.println(num2+" : 홀수");
		
		}
		
		
		int kor = 81, eng = 79, math = 81;
		int sum = kor+eng+math;
		double avg = (double)sum/3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if(avg>80) {
			System.out.println("합격");
			
		}else {System.out.println("불합격");
		
		}
			
		
		
		
		
		
	
	}

}
