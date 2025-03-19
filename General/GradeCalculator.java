import java.util.Scanner;

 class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double totalScore = 0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter score for student " + i + ": ");
            double score = scanner.nextDouble();
            totalScore += score;
        }

        double average = totalScore / numStudents;
        System.out.println("Average score: " + average);
    }
}
