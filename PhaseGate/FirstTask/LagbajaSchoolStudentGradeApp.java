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
	    int firstSubjectHighest = Integer.MIN_VALUE;
	    int lowest = Integer.MAX_VALUE;
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
            highest = firstStudentScore[i];
          }
        }
        for (int i = 0; i < 4; i++) {
          if (secondStudentScore[i] > highest) {
            highest = secondStudentScore[i];
          }
        }
        for (int i = 0; i < 4; i++) {
          if (thirdStudentScore[i] > highest) {
            highest = thirdStudentScore[i];
          }
        }
        for (int i = 0; i < 4; i++) {
          if (fourthStudentScore[i] > highest) {
            highest = fourthStudentScore[i];
          }
        }

		
            System.out.printf("The highest score is: %d%n", highest);


            
        for (int i = 0; i < 4; i++) {
          if (firstStudentScore[i] < lowest) {
            lowest = firstStudentScore[i];
          }
        }
        for (int i = 0; i < 4; i++) {
          if (secondStudentScore[i] < lowest) {
            lowest = secondStudentScore[i];
          }
        }
        for (int i = 0; i < 4; i++) {
          if (thirdStudentScore[i] < lowest) {
            lowest = thirdStudentScore[i];
          }
        }
        for (int i = 0; i < 4; i++) {
          if (fourthStudentScore[i] < lowest) {
            lowest = fourthStudentScore[i];
          }
        }
		
        
        int firstStudentTotal = 0;
        for (int k = 0; k < firstStudentScore.length; k++) {
          firstStudentTotal += firstStudentScore[k];
        }
        
        int secondStudentTotal = 0;
        for (int k = 0; k < secondStudentScore.length; k++) {
          secondStudentTotal += secondStudentScore[k];
        }
        
        int thirdStudentTotal = 0;
        for (int k = 0; k < thirdStudentScore.length; k++) {
          thirdStudentTotal += thirdStudentScore[k];
        }
        
        int fourthStudentTotal = 0;
        for (int k = 0; k < fourthStudentScore.length; k++) {
          fourthStudentTotal += fourthStudentScore[k];
        }

		
        float firstStudentAverage = firstStudentTotal / 4;
        float secondStudentAverage = secondStudentTotal / 4;
        float thirdStudentAverage = thirdStudentTotal / 4;
        float fourthStudentAverage = fourthStudentTotal / 4;

		
        String firstPosition = "1";
        String secondPosition = "2";
        String thirdPosition = "3";
        String fourthPosition = "4";

		
        float max = firstStudentAverage;
        if (secondStudentAverage > max && secondStudentAverage > thirdStudentAverage && secondStudentAverage > fourthStudentAverage) {
          secondPosition = "1";
          firstPosition = "2";
          thirdPosition = "3";
          fourthPosition = "4";
        } else if (thirdStudentAverage > max && thirdStudentAverage > fourthStudentAverage) {
          thirdPosition = "1";
          firstPosition = "2";
          secondPosition = "3";
          fourthPosition = "4";
          } else if (fourthStudentAverage > max) {
              fourthPosition = "1";
              thirdPosition = "2";
              secondPosition = "3";
              firstPosition = "4";
            } else {
                firstPosition = "1";
                secondPosition = "2";
                thirdPosition = "3";
                fourthPosition = "4";
} 
          for (int i = 0; i < subjectNumber.length; i++) {
            
            
          }

		
            System.out.printf("The lowest score is: %d%n\n", lowest);
            System.out.println( "=============================================================================================================");
            System.out.printf( "%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "STUDENT", "SUB1", "SUB2", "SUB3", "SUB4", "TOT", "AVE", "POS");
            System.out.println( "=============================================================================================================");
            System.out.printf( "%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%-15s\n", "Student 1", firstStudentScore[0], firstStudentScore[1], firstStudentScore[2], firstStudentScore[3], firstStudentTotal, firstStudentAverage, firstPosition);
            System.out.printf( "%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%-15s\n", "Student 2", secondStudentScore[0], secondStudentScore[1], secondStudentScore[2], secondStudentScore[3], secondStudentTotal, secondStudentAverage, secondPosition);
            System.out.printf( "%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%-15s\n", "Student 3", thirdStudentScore[0], thirdStudentScore[1], thirdStudentScore[2], thirdStudentScore[3], thirdStudentTotal, thirdStudentAverage, thirdPosition);
            System.out.printf( "%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%-15s\n", "Student 4", fourthStudentScore[0], fourthStudentScore[1], fourthStudentScore[2], fourthStudentScore[3], fourthStudentTotal, fourthStudentAverage, fourthPosition);
            System.out.println( "=============================================================================================================");
            System.out.println( "=============================================================================================================");
            
            
        }
    }
