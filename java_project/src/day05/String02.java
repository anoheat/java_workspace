package day05;

public class String02 {

	public static void main(String[] args) {
		// 이것이자바다.txt => 파일명과 확장자를 분리하여 출력
		
		String fileName = "이것이자바다.txt";
		
		System.out.println("파일명 : "+fileName.substring(0,fileName.indexOf(".")));
		System.out.println("확장자명 : "+fileName.substring(fileName.indexOf(".")));
		
		//contains(str) : 해당 글자를 포함하고 있는지 체크 boolean으로 리턴
		
		System.out.println(fileName.contains("자바"));
		
		
				
		
	}

}
