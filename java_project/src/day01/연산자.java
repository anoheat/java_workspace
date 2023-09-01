package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		a-=1;
		System.out.println(a);
		int b=10;
		a=b;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3%2="+(3%2));
		
		System.out.println("3>2 ? "+(3>2));
		System.out.println("3<2 ? "+(3<2));
		System.out.println("3=2 ? "+(3==2));
		System.out.println("3!=2 ? "+(32));
		
		System.out.println("&&연산자 : "+(3>2 && 4<3));
		System.out.println("|| 연산자 : "+(3>2 || 4<3));
		
		System.out.println((3>2)? "참입니다." : "거짓입니다.");
		
		int num = 6;
		System.out.println((num%2==0)? "짝수" : "홀수");
		
		
		String result = (num%2 ==0)? "짝" : "홀";
		System.out.println(num+"은 "+result);
		
			
	
		
	}

}
