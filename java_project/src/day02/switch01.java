package day02;

public class switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
//		num = 1;
//		switch(num) {
//		case 1:
//			System.out.println("num은 1입니다.");
//			break;
//			
//		case 2:
//			System.out.println("num은 2입니다.");
//			break;
//			
//		case 3:
//			System.out.println("num은 3입니다.");
//			break;
//			
//		default:
//			System.out.println("잘못된 입력입니다.");
//			
//		}
//		
		//1~6수 랜덤 추출
		
		num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1:
			System.out.println("1칸 전진");
			break;
		case 2:
			System.out.println("2칸 전진");
			break;
		case 3:
			System.out.println("3칸 전진");
			break;
		case 4:
			System.out.println("4칸 전진");
			break;
		case 5:
			System.out.println("5칸 전진");
			break;
		default:
			System.out.println("6칸 전진");
		}
		
	
	
	
	}

}
