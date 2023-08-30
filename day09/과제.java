package day09;

public class 과제 {

	public static void main(String[] args) {
		// 클래스 객체 생성(2명)
		Student s1 = new Student("김엊저구","인천","0102424242",35);
		Student s2 = new Student("박저쩌구","서울","0202020110",532);
		s1.print();
		System.out.println(s2.getName()+"("+s2.getAge()+") "+s2.getPhoneNumber());
	}

}

class Student {
	private String name, address, phoneNumber;
	private int age;

	public Student(String name,String address, String phoneNumber, int age) {
		this.name = name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	void print() {
		System.out.println(name + "(" + age + ") " + phoneNumber);
	}

}