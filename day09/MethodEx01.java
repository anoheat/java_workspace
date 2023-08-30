package day09;
//public은 파일명과 일치하는 class에만 가능
//한 파일에 1개만 public class 존재
public class MethodEx01 {
	//멤버변수 자리
	
	
	
	//메서드 자리
	//기능 : 두 정수의 합을 리턴
	int sum(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	void sumPrint(int num1,int num2) {
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		//넘1넘2숫자두개주고 두수합리턴메서드 

	}

}


//클래스 자리