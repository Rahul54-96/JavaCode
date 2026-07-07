package assignments;


class Organization 
{
    public Organization() 
    {
        System.out.println("Grand Parent : Organization class non-parameterized constructor");
    }

    public Organization(String OrgName, int workYear) 
    {
        System.out.println("Grand Parent : Organization class parameterized constructor");
    }

    public void displayGrandParentInfo() 
    {
        System.out.println("Grand Parent : Organization class non-parameterized method");
    }
}

class Department extends Organization {
    public Department() {
       System.out.println("Parent : Department class Non-parameterized constructor");
      }

    public Department(String DeptName, String DeptHead) {
        super();
        System.out.println("Department : Department class parameterized constructor 1");
    }
    public Department(String OrgName, int workYear, String DeptName, String DeptHead) {
        super(OrgName, workYear);
        System.out.println("Parent : Department class parameterized constructor 2");
    }

    public void displayParentInfo() {
        System.out.println("Parent : Department class non-parameterized method");
    }
}


class Employee extends Department {

    public Employee() {
        System.out.println("Child: Employee class Non-parameterized constructor");
     }


    public Employee(String empName, String designation) {
        super();
        System.out.println("Child: Employee class Parameterized constructor");
    }

    public Employee(String DeptName, String DeptHead, String empName, String designation) {
        super(DeptName, DeptHead);
        System.out.println("Child: Employee class Parameterized constructor");
    }

    public Employee(String OrgName, int workYear, String DeptName, String DeptHead, 
                 String empName, String designation) {
        super(OrgName, workYear, DeptName, DeptHead);
        System.out.println("Child: Employee class Parameterized constructor");
    }

    public void displayChildInfo() {
        System.out.println("Child: Employee class method");
    }

    public void displayAllInfo() {
        displayGrandParentInfo();
        displayParentInfo();
        displayChildInfo();
    }
}


public class A36_SuperCallingStmt {
    public static void main(String[] args) {

    	Employee emp1 = new Employee();
        emp1.displayAllInfo();

        Employee emp2 = new Employee("Arjun", "St. Xavier School");
        emp2.displayAllInfo();

        Employee emp3 = new Employee("Rajesh Kumar", "Software Engineer", "Arjun", "Delhi Public School");
        emp3.displayAllInfo();

        Employee emp4 = new Employee("Hari Singh", 70, "Rajesh Kumar", "Software Engineer","Arjun Kumar", "Delhi Public School");
        emp4.displayAllInfo();

        Organization org1 = new Organization();
        org1.displayGrandParentInfo();

        Organization org2 = new Organization("Hari Singh", 75);
        org2.displayGrandParentInfo();

        Department dept1 = new Department();
        dept1.displayGrandParentInfo();
        dept1.displayParentInfo();

        Department dept2 = new Department("Hari Singh", 70, "Rajesh Kumar", "Software Engineer");
        dept2.displayGrandParentInfo();
        dept2.displayParentInfo();
    }
}