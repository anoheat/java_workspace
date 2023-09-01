package day06;

public class Method01 {

	public static void main(String[] args) {
		// 메서드 : 기능 / 함수
		// 접근제어자(제한자) : 접근할 수 있는 주체의 제한범위
		// 리턴타입 : 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		// 메서드명 : 메서드의 이름 => 소문자로 시작
		// 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값
		// 메서드 선언구현
		// 접근제어자 리턴타입 메서드명(매개변수,매개변수){}
		// 메서드 선언 위치 : 클래스 안, 다른 메서드 밖
		int sum = sum(3, 5);
		System.out.println(sum);

		int sum1 = sum(sum, 10);
		System.out.println(sum1);

		System.out.println(gop(3, 5));
		
		sum2(3,5);

	}

	// 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	// 두 정수가 주어지면 두 정수의 곱을 리턴
	public static int gop(int num1, int num2) {
		return num1 * num2;
	}
	
	// 두 정수가 주어지면 두 정수의 합을 출력
	public static void sum2(int num1,int num2) {
		System.out.println(num1+num2);
	}
	

}
