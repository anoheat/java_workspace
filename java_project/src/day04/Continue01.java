package day04;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue : pass, skip
		//1~10까지 출력 5만 빼고
		
		for(int i=1; i<11; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
	}

}
