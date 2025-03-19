import java.io.*;
import java.util.Scanner;

class Student1 {
  String name;
  int rollno;
  int engMarks;
  int mathMarks;
  int scienceMarks;
  double totalMarks;
  double percentage;
  char grade;
  static int counter = 1;

  void createStudent() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name:");
    this.name = sc.nextLine();
    System.out.println("Enter rollno:");
    this.rollno = sc.nextInt();
    System.out.println("Enter english marks:");
    this.engMarks = sc.nextInt();
    System.out.println("Enter math marks:");
    this.mathMarks = sc.nextInt();
    System.out.println("Enter science marks:");
    this.scienceMarks = sc.nextInt();
    this.grade = calculateGrade();
    boolean save = saveStudentToFile();
    if (save) {
      System.out.println("Student saved successfully");
    } else {
      System.out.println("Student not saved successfully");
    }
  }

  char calculateGrade() {
    this.totalMarks = this.engMarks + this.mathMarks + this.scienceMarks;
    this.percentage = (this.totalMarks / 300.0) * 100;
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

  boolean saveStudentToFile() {
    try {
      FileWriter fw = new FileWriter("student.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Data of student " + counter + "\n");
      bw.write("Rollno: " + this.rollno + "\n");
      bw.write("Name: " + this.name + "\n");
      bw.write("English Marks: " + this.engMarks + "\n");
      bw.write("Math Marks: " + this.mathMarks + "\n");
      bw.write("Science Marks: " + this.scienceMarks + "\n");
      bw.write("Total Marks: " + this.totalMarks + "\n");
      bw.write("Percentage: " + this.percentage + "\n");
      bw.write("Grade: " + this.grade + "\n");
      bw.write("\n");
      bw.close();
      counter++;
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  void display() {
    System.out.println("Name: " + this.name);
    System.out.println("Rollno: " + this.rollno);
    System.out.println("English Marks: " + this.engMarks);
    System.out.println("Math Marks: " + this.mathMarks);
    System.out.println("Science Marks: " + this.scienceMarks);
    System.out.println("Total Marks: " + this.totalMarks);
    System.out.println("Percentage: " + this.percentage);
    System.out.println("Grade: " + this.grade);
  }

  void searchStudent() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rollno to search:");
    int rollno = sc.nextInt();
    try {
      FileReader fr = new FileReader("student.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      boolean found = false;
      while ((line = br.readLine()) != null) {
        if (line.contains("Rollno: " + rollno)) {
          System.out.println("Student found:");
          for (int i = 0; i < 8; i++) {
            System.out.println(line);
            line = br.readLine();
          }
          found = true;
          break;
        }
      }
      br.close();
      if (!found) {
        System.out.println("Student not found");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("An error occurred while searching for the student");
    }
  }
}

public class Student1File {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Student1 s = new Student1();
    int choice = 0;

    while (choice != 4) {
      System.out.println("Menu");
      System.out.println("1. Create Student");
      System.out.println("2. Display Student");
      System.out.println("3. Search Student");
      System.out.println("4. Exit");
      System.out.println("Enter your choice:");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          s.createStudent();
          break;
        case 2:
          s.display();
          break;
        case 3:
          s.searchStudent();
          break;
        case 4:
          System.out.println("Exiting...");
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }
}