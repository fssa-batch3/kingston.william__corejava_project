package day05.practice;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Department stuDept = new Department("english", 1);
		
		Student student = new Student("kingston", 3, stuDept);
		
		System.out.println(student);
	}
}