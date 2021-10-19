package day101901J2EE22spring01;

public class User4 {

	public User4() {

		System.out.println("调用一个无参的构造函数");

	}

	public User4(String name) {

		System.out.println("调用一个参数的构造函数");
		
		this.name=name;

	}
	
	public User4(String name,Dog dog) {

		System.out.println("调用两个参数的构造函数");
		
		this.name=name;
		this.dog=dog;

	}

	private String name;
	private Dog dog;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

}
