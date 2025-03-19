
//Student management 
import java.util.Scanner;

class Student {
  String name;
  int rollno;
  int engMarks;
  int mathMarks;
  int scienceMarks;
  double totalMarks;
  double percentage;
  char grade;

  Student() {
    this.name = " ";
    this.rollno = 0;
    this.engMarks = 0;
    this.mathMarks = 0;
  }

  void getDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
    this.name = sc.nextLine();
    System.out.println("Enter rollno");
    this.rollno = sc.nextInt();
    System.out.println("Enter english marks");
    this.engMarks = sc.nextInt();
    System.out.println("Enter math marks");
    this.mathMarks = sc.nextInt();
    System.out.println("Enter science marks");
    this.scienceMarks = sc.nextInt();
    this.grade = calculateGrade();
  }

  char calculateGrade() {
    this.totalMarks = this.engMarks + this.mathMarks + this.scienceMarks;
    this.percentage = (this.totalMarks / 300) * 100;
    if (this.percentage >= 90)
      return 'A';
    else if (this.percentage >= 80)
      return 'B';
    else if (this.percentage >= 60)
      return 'C';
    else if (this.percentage >= 40)
      return 'D';
    else
      return 'F';
  }

  void display() {
    System.out.println("Name:" + this.name);
    System.out.println("Rollno:" + this.rollno);
    System.out.println("English Marks:" + this.engMarks);
    System.out.println("Math Marks:" + this.mathMarks);
    System.out.println("Science Marks:" + this.scienceMarks);
    System.out.println("Total Marks:" + this.totalMarks);
    System.out.println("Percentage:" + this.percentage);
    System.out.println("Grade:" + this.grade);
  }
}

public class StudentGradeCalculation {
  public static void main(String[] args) {
    Student s = new Student();
    s.getDetails();
    s.display();
  }

}