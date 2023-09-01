package day04;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while 반복문
		//while(조건식){조건식증감} 조건식 true면 계속 반복
		
		for(int i=1;i<11;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("줄바꿈");
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println("줄바꿈");
		i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
			
		}
		
		
	}

}
