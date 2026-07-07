package assignments;

class personClass {
 static void personName() {
     System.out.println("This is a person class Subject static method.");
 }

 void age() {
     System.out.println("This is a person class non-static method");
 }
}

class Student extends personClass
{
 static void studentName() {
     System.out.println("This is an Student class static method");
 }

 void rollno() {
     System.out.println("This is an Student class non-static method");
 }
}

class Teacher extends personClass {
 static void teacherName() {
     System.out.println("This is a Teacher class static method");
 }

 void techID() {
     System.out.println("This is a Teacher class non-static method");
 }
}

//Child Class 3
class MathTeacher extends Teacher {
 static void mathTeacherName() {
     System.out.println("This is a MathTeacher class static method");
 }

 void specialization() {
     System.out.println("This is a MathTeacher class static method");
 }
}

//Main Class to execute the program
public class A35_HybridLevelInheritance {
 public static void main(String[] args) {
     
	 Student.personName();
	 Student.studentName();
	 Student stu = new Student();
	 stu.age();
	 stu.rollno();

	 Teacher.personName();
	 Teacher.teacherName();
	 Teacher tech = new Teacher();
	 tech.age();
	 tech.techID();

	 MathTeacher.personName();
	 MathTeacher.teacherName();
	 MathTeacher.mathTeacherName();
	 MathTeacher Mtech = new MathTeacher();
	 Mtech.age();
	 Mtech.techID();
	 Mtech.specialization();
	 }
}
