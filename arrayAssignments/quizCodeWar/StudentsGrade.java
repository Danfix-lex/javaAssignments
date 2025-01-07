import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Student that you want to grade: ");
        int studentNumber = input.nextInt();
        int number = 0;
        int grade;

        while (number < studentNumber) {
            System.out.print("Enter student's grade: ");
            grade = input.nextInt();
            if (grade >= 50) {
                System.out.println("Student " + (number + 1) + " grade: " + grade);
                number++;
            }
        }
    }
}

