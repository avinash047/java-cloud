package student;

public class StudentData {

	public static void main(String[] args) {
		Student s = new Student(101, "Sachin", 888885555, "IT", 50000);
		Student s1 = new Student(102, "Rohit", 888885558, "CSE", 70000);
		double d1=s.totalFees();
		double d2=s1.totalFees();
		
		s.show();
		s1.show();
		System.out.println("Total Fess: "+(d1+d2));
		

	}

}
