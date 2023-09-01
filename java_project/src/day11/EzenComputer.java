package day11;

public class EzenComputer {

	private String name;
	private String birth, phone, branch;
	private int age;
	private int cnt = 0;
	public final static String company = "EZEN";
	private String[] course = new String[5];
	private String[] period = new String[5];

	public EzenComputer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public EzenComputer(String name, String birth, String phone, String branch, int age) {
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.branch = branch;
		this.age = age;
	}

	void printStudent() {
		System.out.print("이름 : " + name + " ");
		if (birth != null)
			System.out.print(birth + " ");
		System.out.print(age + "세 ");
		if (phone != null)
			System.out.print(phone + " ");
		System.out.println();
	}

	void printAcademy() {
		System.out.print(company + " ");
		if (branch != null)
			System.out.println(branch + "지점");
		System.out.println();
	}

	void printCourse() {
		for (int i = 0; i < course.length; i++) {
			if (course[i] == null) {
				System.out.println();
				return;
			}
			System.out.print(course[i] + period[i] + " ");
		}
	}

	void addCourse(String co, String pe) {
		this.course[cnt] = co;
		this.period[cnt] = pe;
		cnt++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course[cnt] = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period[cnt] = period;
	}

	public static String getCompany() {
		return company;
	}

}
