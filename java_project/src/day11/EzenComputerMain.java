package day11;

import java.util.Scanner;

public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer의 객체 생성 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		String name = sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		EzenComputer ez = new EzenComputer(name, age);
		System.out.println("지점 입력");
		ez.setBranch(sc.next());
		String course;
		String period;
		for (int j = 6; j > 1; j--) {
			System.out.println("과정명 입력");
			course = sc.next();
			System.out.println("기간 입력 ex)n개월");
			period = sc.next();
			ez.addCourse(course, period);
			System.out.println("추가 입력? Y/N");
			String tmp = sc.next();
			if (tmp.equals("N") || tmp.equals("n"))
				break;
		}
		EzenComputer[] std = new EzenComputer[7];
		std[0] = ez;
		std[1] = new EzenComputer("김씨", "991108", "010-6008-0017", "인천", 25);
		std[2] = new EzenComputer("이씨", "041201", "010-7853-7150", "인천", 20);
		std[3] = new EzenComputer("박씨", "000101", "010-0598-1896", "서울", 24);
		std[4] = new EzenComputer("양씨", "080808", "010-5158-6891", "서울", 16);
		std[5] = new EzenComputer("최씨", "060606", "010-6578-9117", "부천", 18);
		std[6] = new EzenComputer("남씨", "070707", "010-1348-7487", "부평", 17);
		std[1].addCourse("DB", "1개월");
		std[1].addCourse("html", "2개월");
		std[3].addCourse("java", "6개월");
		std[4].addCourse("java", "6개월");
		System.out.print("1. 이름검색\n2. 지점검색\n3. 과정검색 ");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("검색어 입력");
			String searchName = sc.next();
			System.out.println("검색 결과");
			for (int i = 0; i < std.length; i++) {
				if (std[i].getName().contains(searchName)) {
					std[i].printStudent();
					std[i].printCourse();
					std[i].printAcademy();
				}
			}
			break;
		case 2:
			System.out.println("검색어 입력");
			String searchBranch = sc.next();
			System.out.println("검색 결과");
			for (int i = 0; i < std.length; i++) {
				if (std[i].getBranch().contains(searchBranch)) {
					std[i].printStudent();
				}
			}
			break;
		case 3:
			System.out.println("검색어 입력");
			String searchCourse = sc.next();
			System.out.println("검색 결과");
			for (int i = 0; i < std.length; i++) {
				for (int j = 0; j < std[i].getCourse().length; j++) {
					if (std[i].getCourse()[j] != null) {
						if (std[i].getCourse()[j].contains(searchCourse)) {
							std[i].printStudent();
							std[i].printCourse();
						}
					}
				}
			}
		}
	}
}
