package day12;

import java.util.Scanner;

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent ez = new EzenStudent();
		System.out.println(ez);
	}

}

/*멤버변ㅅ : 지점, 이름, 반, 전화번호
 * 메서드 : 출력 (print메서드)
 * 게세
 * */
class EzenStudent{
	private String name, course, phone, branch;
	
	public EzenStudent() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		name = sc.next();
		System.out.println("반 입력");
		course = sc.next();
		System.out.println("전화번호 입력");
		phone = sc.next();
		System.out.println("지점 입력");
		branch = sc.next();
		
	}

	
	@Override
	public String toString() {
		return "name=" + name + ", course=" + course + ", phone=" + phone + ", branch=" + branch + "]";
	}

	public EzenStudent(String name, String course, String phone, String branch) {
		this.name = name;
		this.course = course;
		this.phone = phone;
		this.branch = branch;
	}

	void print() {
		System.out.println("이름 : "+name+"반 : "+course+"번호 : "+phone+"지점 : "+branch);
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}