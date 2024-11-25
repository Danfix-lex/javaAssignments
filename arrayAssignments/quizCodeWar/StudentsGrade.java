import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int grade;

        while (number < 30) {
            System.out.print("Enter student's grade: ");
            grade = input.nextInt();
            if (grade >= 50) {
                System.out.println("Student " + (number + 1) + " grade: " + grade);
                number++;
            }
        }
    }
}

