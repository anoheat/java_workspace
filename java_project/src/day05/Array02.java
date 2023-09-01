package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/*
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 저장한 후 출력 
		 */
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[5];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = (int)(Math.random()*50)+1;
			System.out.println((i+1)+"번째값 : "+arr1[i]);
		}
		
		//정렬(오름차순) 이중포문
		for(int i=0; i<arr1.length;i++) {
			for(int j=i+1; j<arr1.length;j++) {
				if(arr1[i] > arr1[j]) {
					int tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		//향상된 for문
		System.out.println();
		System.out.println("향상된 for >");
		for(int temp : arr1) {
			System.out.print(temp+" ");
		}
	}
	

}
