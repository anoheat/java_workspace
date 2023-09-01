package day04;

public class Array01 {

	public static void main(String[] args) {
		/* 타입[] 배열이름;
		 * 타입 배열이름[];
		 * 타입[] 배열이름 = new 타입[길이];
		 */
		 int[] arr;
		 arr = new int[5];
		 
		 int arr1[];
		 int arr2[] = new int[] {1,2,3,4,5};
		 System.out.println(arr2[0]);
		 System.out.println(arr2[1]);
		 System.out.println(arr2[2]);
		 System.out.println(arr2[3]);
		 System.out.println(arr2[4]);
		 for(int i=0;i<arr2.length;i++) {
			 System.out.print(arr2[i]+" ");
			 
		 }
		 System.out.println();
		 System.out.println("-------------");
		 int arr3[] = {1,2,3};
		 
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 System.out.println(arr[0]);

		 for(int i=0; i<arr.length;i++) {
			 arr[i]=(i*10)+10;
		 }
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 //배열 생성하고, 12345입력하고 저장하고 출력
		 
		 int arr4[] = new int[5];
		 for(int i=0;i<5;i++) {
			 arr4[i] = (i*1)+1;
			 System.out.print(arr4[i]+" ");
		 }
		System.out.println();
		System.out.println("---");
		 
		 
		 int[] arr5 = new int[5];
		 for(int i=0;i<5;i++) {
			 arr5[i] = (i*2)+2;
			 System.out.print(arr5[i]+" ");
		 }
		 
		 
		 
	}

}
