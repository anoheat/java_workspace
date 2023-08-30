package day07;

public class Method04 {
	int[] arr() {
		int[] b = new int[5];
		for (int i = 0; i < b.length; i++) {
			int a = (int) (Math.random() * 100) + 1;
			b[i] = a;
		}
		return b;
	}

	double avg(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double) sum / arr.length;
		return avg;
	}

	void print() {
		System.out.print("항목 : ");
		int[] arr = arr();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("평균 : " + avg(arr));
	}

	public static void main(String[] args) {
		Method04 me = new Method04();
		me.print();
	}

}
