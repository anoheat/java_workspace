package day09;

import java.util.Scanner;

public class BaseballGame {
	
	public static int random(int start, int end) {
		if(end<start) {
			int tmp = end;
			end = start;
			start = tmp;
		}
		return (int)(Math.random()*end)+start;
	}

	public static void randomArray(int arr[]) {
		int i=0;
		while(i < arr.length) {
			int r = random(1,9);
			if(!isContain(arr, r)) {
				arr[i]=r;
				i++;
			}
		}
	}
	
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	public static void printArray(int arr[]) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
	public static int strike(int com[],int my[]) {
		int cnt=0;
		for(int i =0; i<com.length;i++) {
			if(com[i]==my[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public static int ball(int com[],int my[]) {
		int cnt=0;
		for(int i=0; i<com.length;i++) {
			if(isContain(my, com[i])) {
				cnt++;
			}
		}
		return cnt - strike(com,my);
	}
	
	
	
	
	public static void main(String[] args) {
		// 랜덤 번호 생성
		// 배열에 추가(중복제거 메서드)
		// 출력메서드
		// 스트라이크 메서드
		// 볼 메서드
		Scanner sc = new Scanner(System.in);
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		randomArray(comNum);
				
		sc.nextInt();
		
		int count = 9;
		int start = 1;
		int s=0, b=0;
		int cnt=0; 
		
		while(s!=3) {
			for(int i=0; i<myNum.length;i++) {
				myNum[i]=sc.nextInt();
			}
			cnt++;
		}
		s = strike(comNum,myNum);
		b = ball(comNum,myNum);
		
		if(s!=0) {
			System.out.print(s+"s ");
			
		}
		if(b!=0) {
			System.out.println(b+"b ");
		}
		System.out.println();
		System.out.println("ㅎㅅ"+cnt);
		if(s==0&&b==0) {
			System.out.println("out");
		}
		System.out.println();
	}

}
