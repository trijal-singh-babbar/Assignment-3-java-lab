// StudentOperations.java  //perform CRUD

import java.util.*;
class StudentOperations
{
	ArrayList<Student> students;  // <Student> refers to Student.java   // students is the arraylist
	
	public StudentOperations()
	{
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student  student)   // adding student 
	{
		students.add(student);
		System.out.println("Student Added");
	}
	
	public void displayStudents()
	{
		for(Student student : students)
		{
			student.display();
		}
	}
}
