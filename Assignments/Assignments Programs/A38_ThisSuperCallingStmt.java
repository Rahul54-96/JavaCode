package assignments;

class University {
    public University() {
        System.out.println("Grand Parent : University class non-parameterized constructor");
           }

    public University(String UniName, int EstYear) {
        System.out.println("Grand Parent : University class parameterized constructor");
        }

    public void displayGrandParentInfo() {
        System.out.println("Grand Parent : University class method");
    }
}

class college extends University {
    public college() {
        System.out.println("Parent : college class Non-parameterized constructor");
          }

       public college(String DeptName, String DeptHead) {
        this(); 
        System.out.println("Department : college class parameterized constructor (DeptName, DeptHead)");
           }

       public college(String UniName, int workYear, String DeptName, String DeptHead) {
        super(UniName, workYear); 
        System.out.println("Parent : college class parameterized constructor (UniName, workYear, DeptName, DeptHead)");
    }

    public void displayParentInfo() {
        System.out.println("Parent : college class method");
    }
}

class Faculty extends college {
   public Faculty() {
        System.out.println("Child: Faculty class Non-parameterized constructor");
        
    }
    public Faculty(String empName, String designation) {
        this(); 
        System.out.println("Child: Faculty class Parameterized constructor (empName, designation)");
       
    }

   
    public Faculty(String DeptName, String DeptHead, String empName, String designation) {
        super(DeptName, DeptHead);
        System.out.println("Child: Faculty class Parameterized constructor (DeptName, DeptHead, empName, designation)");
    }
  public Faculty(String UniName, int workYear, String DeptName, String DeptHead,
                   String empName, String designation) {
        super(UniName, workYear, DeptName, DeptHead); 
        System.out.println("Child: Faculty class Parameterized constructor (full org -> dept -> emp)");
           }

    public void displayChildInfo() {
        System.out.println("Child: Faculty class method");
    }

    public void displayAllInfo() {
        displayGrandParentInfo();
        displayParentInfo();
        displayChildInfo();
    }
}

public class A38_ThisSuperCallingStmt {
    public static void main(String[] args) {

        Faculty emp1 = new Faculty();
        emp1.displayAllInfo();
        Faculty emp2 = new Faculty("Arjun", "Lecturer");
        emp2.displayAllInfo();
        Faculty emp3 = new Faculty("Computer Science", "Dr. Sharma", "Rajesh Kumar", "Assistant Professor");
        emp3.displayAllInfo();
        Faculty emp4 = new Faculty("Hari University", 1970, "Electrical", "Dr. Rao", "Arjun Kumar", "Associate Professor");
        emp4.displayAllInfo();

        University org1 = new University();
        org1.displayGrandParentInfo();
        University org2 = new University("Hari University", 1970);
        org2.displayGrandParentInfo();

        college dept1 = new college();
        dept1.displayGrandParentInfo();
        dept1.displayParentInfo();
        college dept2 = new college("Hari University", 1970, "Mechanical", "Dr. Singh");
        dept2.displayGrandParentInfo();
        dept2.displayParentInfo();
    }
}