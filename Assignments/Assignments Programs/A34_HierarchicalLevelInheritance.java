package assignments;

class Subject {
 static void subjectNames() {
     System.out.println("This is a Subject class Subject static method.");
 }

 void speciallization() {
     System.out.println("This is a suject class non-static method");
 }
}

class English extends Subject {
 static void grammerCheck() {
     System.out.println("This is an English class static method");
 }

 void englishPoet() {
     System.out.println("This is an English class non-static method");
 }
}

class Mathematics extends Subject {
 static void areaOfcircle() {
     System.out.println("This is a Math class static method");
 }

 void areaOfSquare() {
     System.out.println("This is a Math class non-static method");
 }
}

//Child Class 3
class Science extends Subject {
 static void newtonsLaw() {
     System.out.println("This is a Science class static method");
 }

 void gravityMethod() {
     System.out.println("This is a Science class static method");
 }
}

//Main Class to execute the program
public class A34_HierarchicalLevelInheritance {
 public static void main(String[] args) {
     
     English.subjectNames();
     English.grammerCheck();
     English eng = new English();
     eng.speciallization();
     eng.englishPoet();

     Mathematics.subjectNames();
     Mathematics.areaOfcircle();
     Mathematics mat = new Mathematics();
     mat.speciallization();
     mat.areaOfSquare();

     Science.subjectNames();
     Science.newtonsLaw();
     Science sci = new Science();
     sci.speciallization();
     sci.gravityMethod();
 }
}
