package day02;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/ Math.round 반올림 : 소수점 자리수 0
		 * Math.ceil 올림 Math.floor 버림  얘네도 마찬가지
		 */
		
		double num = 34.66666666;
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max Math.min 두 수중 큰 값 작은 값
		System.out.println(Math.max(5, 4));
		System.out.println(Math.min(5, 3));
		
		
		//Math.random 0과 1 사이의 아무값을 리턴
		//(int)(Math.random()*10)+1 1부터 10까지
		//(int)(Math.random()*m)+n n부터 m까지
		
		System.out.println(Math.random()); //0은 포함, 1은 미포함
		
		System.out.println((int)(Math.random()*6)+1);
		
		
		
	}

}
