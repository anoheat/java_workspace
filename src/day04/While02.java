package day04;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
		// 1~50까지 짝수만 출력, 5개씩 한줄로
		int i=1;
		while(i<51) {
			if(i%2==0) {
				System.out.printf("%3d",i);
				if(i%10==0) {
					System.out.println();
				}
			}
			i++;
		}
		
		for(i=1;i<51;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				if(i%10==0) {
					System.out.println();
				}
			}
		}
		System.out.println("출력구문");
		//System.out.println : 줄바꿈 포함 출력
		//System.out.print : 줄바꿈 없는 출력 / 값이 없으면 에러
		//System.out.printf : 지시자(=서식지정자)를 이용한 출력
		// 서식 지정자를 통해 출력할 데이터의 서식을 지정할 수 있음
		// %n(\n줄바꿈) %d(정수형) %f(실수형) %c(문자 하나) %s(문자열)
		//소수점 설정, 공백(띄어쓰기)
		
		System.out.printf("%.2f",1.23456);
		
		int num1 = 5;
		int num2 = 3;
		// 5+3=8로 출력
		System.out.printf("%n%d + %d = %d",num1,num2,num1+num2);
		
		double num3 = 1.23;
		double num4 = 5;
		// 1.23/5=값 출력
		System.out.printf("%n%.1f/%.1f=%.1f",num3,num4,num3/num4);
	}

}
