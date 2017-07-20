package part7;

public class Student extends Person {
	private int grade;

	public int getGrade() {

		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	Student() {

	}

	Student(int grade) {
		this.grade = grade;
	}

	//it's right that i'm doing them but still can't get the point haha :D
	public static void main(String[] args) {
		Person numb1 = new Person("dania");
		System.out.println(numb1.getName() + " is my name");
		
//		Person numb3 = new Student();
//		Person numb2 = new Student("Dania");
		

	}
}
