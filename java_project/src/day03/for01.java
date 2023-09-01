package day03;

public class for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<11;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----------");
		
		for(int i=10;i>0;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------");
		
		for(int i=2;i<11;i++) {
			System.out.print(i+" ");
			i=i+1;
		}
		
		System.out.println();
		System.out.println("-----------");
		
		for(int i=1;i<21;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("-----------");
		
		for(int i=1;i<11;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}else {System.out.print("짝수패스 ");
			}
		}
		System.out.println();
		System.out.println("-----------");
		
		for(int a=1,i=1;i<11;i++,a=a+i) {
			if(i==10) {System.out.println(a);}
		}
		
		System.out.println();
		System.out.println("-----------");
		
		int sum1=0,sum2=0;
		for(int i=1;i<11;i++) {
			if(i%2==0) {
				sum2=sum2+i;
			}else {
				sum1=sum1+i;
			}			
		}
		System.out.println("짝수합 : "+sum2);
		System.out.println("홀수합 : "+sum1);
		System.out.println("-----------");

		
	
	}
	
}
