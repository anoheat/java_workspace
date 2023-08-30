package day05;

public class ArrayCopy {

	public static void main(String[] args) {
		// arraycopy : 배열 복사
		// 객체를 다시 생성해서 값을 복사
		// 배열은 길이를 가지고 있음.
		// 한번 정해진 길이는 늘이거나 줄일 수 없음
		// 배열의 길이를 늘이거나 줄이고 싶을 
		int arr[]= {10,15,20};
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("----");
		
		int arr1[] = new int[5];
		System.arraycopy(arr, 0, arr1, 1, arr.length);
		
		
//		for(int i=0; i<arr.length; i++) {
//			arr1[i] = arr[i];
//		}
//		
		for(int tmp:arr1) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		String[] str1 = {"국어","영어","수학"};
		for(String tmp : str1) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		String[] str2 = new String[str1.length+2];
		System.arraycopy(str1, 0, str2, 0, str1.length);
		str2[3] = "사회";
		str2[4] = "과학";
		
		for(String tmp : str2) {
			System.out.print(tmp+" ");
		}
		
		
		
	
		
		

	
	
	
	
	
	}

}
