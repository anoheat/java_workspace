package day12;


public class Class05 {
	
	public static void main(String[] arg) {
	
	
	}
}




class TV{
	private boolean power;
	final static public String BRAND = "Smasnug";
	
	public void isPower() {
		System.out.println("제조사 : "+BRAND);
		if (!power) {
			power = true;
			System.out.println("TV가 켜졌습니다.");
		}else {
			power = false;
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	public static void printBrand() {
		System.out.println("제조사 : "+BRAND);
//		System.out.println("전원 상태 : "+power); //<<안됨
	}
}