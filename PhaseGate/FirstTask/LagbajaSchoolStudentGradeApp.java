import java.util.Scanner;
import java.util.Arrays;


public class LagbajaSchoolStudentGradeApp {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	
	    System.out.println("Welcome to Lagbaja School Student's Grade App");
	    System.out.println();
	    
	    int[] studentNumber = new int [10];
	    int[] subjectNumber = new int [10];
	
	    System.out.println("Welcome Teacher please enter the number of student or enter (-1) if you have finished entering the number of students: ");
	    int studentCount = 1;
      for (int i = 0; i < 10; i++) {
      System.out.println("Enter the student number in accordance to the below student number (e.g 1, 2, 3 etc...)");
      System.out.println();
      System.out.print("Student's "+studentCount+": ");
      studentNumber[i] = input.nextInt();
      if (studentNumber[i] == -1) {
        System.out.println("You can now proceed to the subject aspect!!");
        System.out.println();
        break;
        }
      studentCount ++;
      System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.out.println("Saved successfully");
      System.out.println();
	}
	    System.out.println("Welcome Teacher please enter the number of subject or enter (-1) if you have finished entering the number of subjects: ");
	    int subjectCount = 1;
      for (int j = 0; j < 10; j++) {
      System.out.println("Enter the subject number in accordance to the below subject number (e.g 1, 2, 3 etc...)");
      System.out.println();
      System.out.print("Subject's "+subjectCount+": ");
      subjectNumber[j] = input.nextInt();
      if (subjectNumber[j] == -1) {
        System.out.println("You can now proceed to the scores aspect!!");
        System.out.println();
        break;
      }
      subjectCount ++;
      System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.out.println("Saved successfully");
	}
	
      for (int j = 0; j < 10; j++) {
      System.out.printf("Entering score for student  the subject number in accordance to the below subject number (e.g 1, 2, 3 etc...)");
      System.out.println();
      System.out.print("Subject's "+subjectCount+": ");
      subjectNumber[j] = input.nextInt();
      if (subjectNumber[j] == -1) {
        System.out.println("You can now proceed to the scores aspect!!");
        System.out.println();
        break;
      }
      subjectCount ++;
      System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.out.println("Saved successfully");
	}
	
	
	
	
	}
}
