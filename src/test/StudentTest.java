package test;


public class StudentTest {
	public static void main(String[] args) {
		int num=2;
		Student student[] = new Student[num];
		for(int i=0;i<student.length;i++)
			student[i]= new Student();
		student[0].name = "JIMMY";
		student[1].name = "JOE";
		student[0].playAndStudy(3, 6);
		student[1].playAndStudy(2, 7);
		student[0].getScore();
		student[1].getScore();
	}
}
