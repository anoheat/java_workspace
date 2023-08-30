package day04;

public class 이중for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*****
		//*****
		//*****
		//*****
		//***** 5*5 별찍기
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------");
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------");
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
