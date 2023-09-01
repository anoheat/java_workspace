package day12;

public class 상속02 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.info();
		d.howl();
		Cat c = new Cat("나비","고양이");
		c.info();
		c.howl();
		Tiger t = new Tiger("호돌","호랑이");
		t.info();
		t.howl();
	}

}

class Animal{
	private String name; //이름
	private String category; //종
	
	public Animal() {}

	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}

	public void info() {
		System.out.println("이름:"+name);
		System.out.println("종:"+category);
		
	}
	
	//울음소리
	public void howl() {
		System.out.println("=="+name+"의 울음소리==");
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

class Dog extends Animal{
	public Dog() {
		setName("강아지");
		setCategory("개");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("멍멍왈왈");
	}
}

class Cat extends Animal{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	public void howl() {
		super.howl();
		System.out.println("야옹야옹");
	}
}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		super(name,category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥");
	}
	
	
}