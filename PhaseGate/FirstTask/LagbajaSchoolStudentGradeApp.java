import java.util.Scanner;
import java.util.Arrays;


public class LagbajaSchoolStudentGradeApp {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	
	    System.out.println("Welcome to Lagbaja School Student's Grade App");
	    System.out.println();
	    
	    int[] studentNumber = new int [4];
	    int[] subjectNumber = new int [4];
	    int[] studentScore = new int [4];
	
	    System.out.println("Welcome Teacher please enter the number of student or enter (-1) if you have finished entering the number of students: ");
	    int studentCount = 1;
      for (int i = 0; i < 10; i++) {
      System.out.print("Do you wish to start/continue input any digit or input -1 to end or skip to the next process: ");
      int studentUserInput = input.nextInt();
      System.out.println("Enter the student number in accordance to the below student number (e.g 1, 2, 3 etc...)");
      System.out.println();
      if (studentUserInput == -1 ||studentCount == 5 ) {
        System.out.println("You can now proceed to the subject aspect!!");
        System.out.println();
        break;
        }
      System.out.print("Student's "+studentCount+": ");
      studentNumber[i] = input.nextInt();
      studentCount ++;
      System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.out.println("Saved successfully");
      System.out.println();
	}
	    System.out.println("Welcome Teacher please enter the number of subject or enter (-1) if you have finished entering the number of subjects: ");
	    int subjectCount = 1;
      for (int j = 0; j < 10; j++) {
      System.out.print("Do you wish to start/continue input any digit or input -1 to end or skip to the next process: ");
      int subjectUserInput = input.nextInt();
      System.out.println("Enter the subject number in accordance to the below subject number (e.g 1, 2, 3 etc...)");
      System.out.println();
      if (subjectUserInput == -1 || subjectCount == 5 ) {
        System.out.println("You can now proceed to the subject aspect!!");
        System.out.println();
        break;
        }
      System.out.print("Subject's "+subjectCount+": ");
      subjectNumber[j] = input.nextInt();
      subjectCount ++;
      System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.out.println("Saved successfully");
	}
	
      for (int k = 0; k < studentNumber.length+1; k++) {
        System.out.printf("Entering score for student %d%n", k+1, studentNumber[k+1]);
        for (int l = 0; l < subjectNumber.length+1; l++) {
          System.out.printf("Enter score for subject %d:", l+1);
          System.out.println();
          studentScore[l] = input.nextInt();
          System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Saved successfully");
      }
    }
      
	}
	
	
	
	
	}
