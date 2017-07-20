package part7;

public class Person {
	private String name;
	private String gender;
	private String eyeColor;
	private int age;
	private int weight;
	private int height;
	
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name= name;
	}
	
	Person(int age) {
		this.age = age;
	}
	
	Person(String name, String gender) {
		this(name);
		this.gender = gender;
	}

//	public static void main(String[] args) {
//		Person random = new Person("dania");
//		System.out.println(getName());
//	}
	



}
