import java.util.Scanner;
import java.util.Arrays;


public class LagbajaSchoolStudentGradeApp {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	
	    System.out.println("Welcome to Lagbaja School Student's Grade App");
	    System.out.println();
	    
	    int[] studentNumber = new int [4];
	    int[] subjectNumber = new int [4];
	    int[] firstStudentScore = new int [4];
	    int[] secondStudentScore = new int [4];
	    int[] thirdStudentScore = new int [4];
	    int[] fourthStudentScore = new int [4];
	    int highest = Integer.MIN_VALUE;
	
	    System.out.println("Welcome Teacher please enter the number of student or enter (-1) if you have finished entering the number of students: ");
	    int studentCount = 1;
      for (int i = 0; i < 10; i++) {
        if (studentCount == 5 ) {
          System.out.println("You can now proceed to the subject aspect!!");
          System.out.println();
        break;
        }
      System.out.println("Enter the student number in accordance to the below student number (e.g 1, 2, 3 etc...)");
      System.out.println();
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
        if (subjectCount == 5 ) {
          System.out.println("You can now proceed to the subject aspect!!");
          System.out.println();
        break;
        }
      System.out.println("Enter the subject number in accordance to the below subject number (e.g 1, 2, 3 etc...)");
      System.out.println();
      System.out.print("Subject's "+subjectCount+": ");
      subjectNumber[j] = input.nextInt();
      subjectCount ++;
      System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
      System.out.println("Saved successfully");
	}
	
      for (int k = 0; k < studentNumber.length; k++) {
        int scoreCount = 1;
        for (int l = 0; l < subjectNumber.length+1; l++) {
          if (scoreCount != 5) {
          System.out.printf("Entering score for student %d%n", k+1);
          System.out.printf("Enter score for subject %d:", scoreCount);
          firstStudentScore[l] = input.nextInt();
          System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Saved successfully");
          System.out.println();
          scoreCount ++;
          } else {
              break;
          }
        }
        break;
      }
      for (int k = 0; k < studentNumber.length; k++) {
        int scoreCount = 1;
        for (int l = 0; l < subjectNumber.length+1; l++) {
          if (scoreCount != 5) {
          System.out.printf("Entering score for student %d%n", k+2);
          System.out.printf("Enter score for subject %d:", scoreCount);
          secondStudentScore[l] = input.nextInt();
          System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Saved successfully");
          System.out.println();
          scoreCount ++;
          } else {
              break;
          }
        }
        break;
      }
      for (int k = 0; k < studentNumber.length; k++) {
        int scoreCount = 1;
        for (int l = 0; l < subjectNumber.length+1; l++) {
          if (scoreCount != 5) {
          System.out.printf("Entering score for student %d%n", k+3);
          System.out.printf("Enter score for subject %d:", scoreCount);
          thirdStudentScore[l] = input.nextInt();
          System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Saved successfully");
          System.out.println();
          scoreCount ++;
          } else {
              break;
          }
        }
        break;
      }
      for (int k = 0; k < studentNumber.length; k++) {
        int scoreCount = 1;
        for (int l = 0; l < subjectNumber.length+1; l++) {
          if (scoreCount != 5) {
          System.out.printf("Entering score for student %d%n", k+4);
          System.out.printf("Enter score for subject %d:", scoreCount);
          fourthStudentScore[l] = input.nextInt();
          System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
          System.out.println("Saved successfully");
          System.out.println();
          scoreCount ++;
          } else {
              break;
          }
        }
        break;
      }
        for (int i = 0; i < 4; i++) {
          if (firstStudentScore[i] > highest) {
            highest = firstStudentScore[i]
          }
        }
        for (int i = 0; i < 4; i++) {
        
        }
            System.out.println(highest);
        }






    }
	}
