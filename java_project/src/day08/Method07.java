package day08;

public class Method07 {
	//배열을 받아서 콘솔에 출력하는 메서드
	//매개변수 int arr[]  리턴 없음   메서드명 printArray()    5개씩 한줄로 나열
	void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			if((i+1)%5==0) System.out.println();
		}	
	}
	int[] orum(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	
	//새로운 배열을 만들어서 랜덤수를 채워 리턴하는 메서드
	//랜덤수(1~100) 매개변수는 배열사이즈  리턴 배열  
	int[] randomArray(int arrLength) {
		int[] arr = new int[arrLength];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		// 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		//int arr[] = new int[] {1,2,2,9,13,7,5,6,10,4,8,3,11,12,14,15,2,3,5};
		Method07 me = new Method07();
		me.printArray(me.orum(me.randomArray(17)));
	}

}
