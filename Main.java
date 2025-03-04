// Main.java

// Trijal Singh Babbar
// Aiml B3
// PRN: 23070126137

import java.util.*;

class Main
{
	public static void main(String args[])
	{		
		Scanner sc = new Scanner(System.in);
		StudentOperations operations = new StudentOperations();
		
		while(true)
		{
			System.out.println("Enter 1 to add student, 2 to display existing students, 3 to exit");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				System.out.println("Enter prn: ");
				long prn = Long.parseLong(sc.nextLine());
				System.out.println("Enter batch: ");
				String batch = sc.nextLine();
				System.out.println("Enter branch: ");
				String branch = sc.nextLine();
				System.out.println("Enter cgpa: ");
				float cgpa = sc.nextFloat();
				sc.nextLine();
				Student student = new Student(name,prn,batch,branch,cgpa);
				operations.addStudent(student);
				break;
				
				case 2:
				operations.displayStudents();
				break;
				
				case 3:
				System.out.println("Exiting...");
				return;
				
				default:
				System.out.println("Wrong input");
				break;
			}
		}
	}
}