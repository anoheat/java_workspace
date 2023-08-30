package day05;

public class String01 {

	public static void main(String[] args) {
		// String 클래스 = 문자열을 다루는 클래스
		// String str = new String();
		// String str = "ㅇㅇ"; // 일반 자료형처럼 이용가능
		
		String str = "hello world";
		System.out.println(str);
		//charAt(index) : index번지에 있는 한글자를 반환
		System.out.println("--charAT--");
		System.out.println(str.charAt(0));
		
		//length 문자열의 전체 길이 공백도포함1글자
		System.out.println("--length");
		System.out.println(str.length());
		
		//compareTo(str) : str문자열과 비교하여 같으면 0, 사전순으로 앞에 있으면 -1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("g".compareTo("a"));
		
		//concat(str) : 이어붙이기 (+연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		//equals(str) : 두 문자열이 같은지 확인(대소문자 구분)
		// == 주소가 같은지 확인 / equals 내용이 같은지 확인
		System.out.println("--equals--");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		
		//indexOf(str) : 문자의 위치를 찾아주는 기능. 찾는 문자가 없으면 -1을 리턴
		System.out.println("--indexOf--");
		System.out.println("abc".indexOf("c"));
		String email = "taehona@naver.co.kr";
		System.out.println(email.indexOf("."));
		System.out.println(email.lastIndexOf("."));
		
		//substring : 문자열 추출
		System.out.println("--substring--");
		System.out.println(email.substring(3,5));
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		//trim : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("       hello   ".trim());
		
		//replace : 글자 치환
		System.out.println("--replace--");
		System.out.println("hello world".replace("world","java"));
		
		//split : 특정 값을 기준으로 나누기
		System.out.println("--split");
		String str1 = "dog,cat,tiger";
		String[] str2 = str1.split(",");
		for(String s : str2) {
			System.out.println(s);
		}
		
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1+num2);
		
		//parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		
	
		
		
	}

}
