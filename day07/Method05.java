package day07;

public class Method05 {
	// 정수가 주어지면 이 정수가 소수인지 아닌지 판단 (소수면true)
	boolean sosu(int a) {
		int cnt = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				cnt++;
			}
		}
		if (cnt == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 2~100까지의 소수를 출력
		// 2~100까지 for문을 돌려서 메서드 호출하여 true면 출력
		Method05 me = new Method05();
		for (int i = 2; i < 101; i++) {
			if (me.sosu(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
