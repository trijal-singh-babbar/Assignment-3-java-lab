# Student Management System - README

## Overview
This Java program is a simple Student Management System that allows users to perform CRUD (Create, Read, Update, Delete) operations on student records. The system consists of three main classes:

1. `StudentOperations.java` - Handles the management of student records.
2. `Student.java` - Represents a student entity with attributes such as name, PRN, batch, branch, and CGPA.
3. `Main.java` - Provides a menu-driven interface to interact with the system.

## Files and Their Functions

### 1. StudentOperations.java
This class manages a list of students using an `ArrayList`.

#### Methods:
- **`public StudentOperations()`**: Constructor that initializes the `ArrayList` of students.
- **`public void addStudent(Student student)`**: Adds a new student to the list.
- **`public void displayStudents()`**: Displays all students stored in the list by calling the `display()` method of the `Student` class.

### 2. Student.java
This class defines the structure of a student and contains getter and setter methods for each attribute.

#### Attributes:
- `private String name` - Student's name.
- `private long prn` - Student's PRN (unique identification number).
- `private String batch` - Student's batch.
- `private String branch` - Student's branch of study.
- `private float cgpa` - Student's CGPA.

#### Methods:
- **Constructor:** `public Student(String name, long prn, String batch, String branch, float cgpa)` - Initializes a new student with provided details.
- **Setter Methods:**
  - `setName(String name)`, `setPRN(long prn)`, `setBatch(String batch)`, `setBranch(String branch)`, `setCGPA(float cgpa)` - Updates respective attributes.
- **Getter Methods:**
  - `getName()`, `getPRN()`, `getBatch()`, `getBranch()`, `getCGPA()` - Retrieves respective attributes.
- **`public void display()`**: Displays the student's details in a formatted manner.

### 3. Main.java
This class contains the `main` method and provides a command-line interface for interacting with the student management system.

#### Functionality:
- Uses `Scanner` for user input.
- Provides a menu-driven interface:
  1. Add a student (Takes input for all attributes and creates a `Student` object).
  2. Display all students.
  3. Exit the application.
- Uses a `switch` case inside a `while(true)` loop to handle user choices.

## How to Run the Program
1. Compile all Java files using:
   ```sh
   javac Main.java
   ```
2. Run the program using:
   ```sh
   java Main
   ```
3. Follow the on-screen instructions to add and view student records.


