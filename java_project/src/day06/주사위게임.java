package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		// 주사위를 던져서 총 30칸을 이동하면 완주
		// 주사위 : 1~6 랜덤수
		// ex) 주사위 : 3 / 3칸이동=>27칸남았습니다.
		// ex) 주사위 : 6 / 6칸이동=>??칸남았습니다.
		// 도착했습니다. 총 이동횟수 : ??
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int num = 30;
		int dice = 0;
		while (true) {
			System.out.println("1 => 주사위 던지기");
			System.out.println("2 => 종료");
			int num1 = scan.nextInt();
			switch (num1) {
			case 1:
				dice = (int) (Math.random() * 6) + 1;
				num -= dice;
				System.out.println("주사위 : " + dice);
				if (num > 0) {
					System.out.println(dice + "칸 이동 => " + num + "칸 남았습니다.");
				} else {
					System.out.println(dice + "칸 이동 => 0칸 남았습니다.");
				}
				cnt++;
				break;
			case 2:
				System.out.println("종료합니다. 주사위 횟수 : " + cnt);
				System.out.println("남은 칸 : " + num);
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			if (num <= 0) {
				System.out.println("도착했습니다. 주사위 던진 횟수 : " + cnt);
				return;
			}
		}

	}

}
