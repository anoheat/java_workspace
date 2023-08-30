package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성
		// 
		
		String[] fileName = { "java의 정석.txt", "이것이 자바다.jpg", "String메서드.jpg", "java의 함수.png" };
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력");
		String search = scan.next(); //공백없는 1단어  / 문장 = nextLine
		System.out.println("검색 결과");
		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].contains(search)) {
				System.out.println(fileName[i]);
			}

		}
		
		
		
		
	}

}
