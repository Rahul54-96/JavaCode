package assignments;

class University2 {
   
    public University2() {
        this("Default University", 1900); 
        System.out.println("University(): no-arg constructor body executed");
    }

    public University2(String uniName, int estYear) {
       System.out.println("University(String,int): parameterized constructor executed");
           }

    public void displayUniversity() {
        System.out.println("University class method ");
    }
}

class College2 extends University2 {
    
    public College2() {
        this("General Studies", "Dr. Default"); 
        System.out.println("College(): no-arg constructor body executed");
    }

    public College2(String deptName, String deptHead) {
        System.out.println("College(String,String): parameterized constructor executed");
    }

    public void displayCollege() {
        displayUniversity(); 
        System.out.println("College class method");
    }
}

class Student2 extends College2 {
    
    public Student2() {
        this("Unknown Student"); 
        System.out.println("Student(): no-arg constructor body executed");
    }

    public Student2(String studentName) {
        this(studentName, 0); 
        System.out.println("Student(String): single-arg constructor body executed");
    }

        public Student2(String studentName, int studentId) {
        System.out.println("Student(String,int): parameterized constructor executed");
    }

    public void displayStudent() {
        displayCollege();
        System.out.println("Student class method");
    }
}

public class A37_ThisCallingStmt {
    public static void main(String[] args) {
        
        Student2 s1 = new Student2();
        s1.displayStudent();
        Student2 s2 = new Student2("Amit");
        s2.displayStudent();
        Student2 s3 = new Student2("Neha", 1024);
        s3.displayStudent();

        College2 c1 = new College2("Computer Science", "Dr. Sharma");
        c1.displayCollege();

        University2 u1 = new University2("Tech University", 2005);
        u1.displayUniversity();
    }
}