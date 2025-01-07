import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchoolStudentGradeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Lagbaja School Student's Grade App");
        System.out.println();

        int[] studentNumber = new int[4];
        int[] subjectNumber = new int[4];
        int[] firstStudentScore = new int[4];
        int[] secondStudentScore = new int[4];
        int[] thirdStudentScore = new int[4];
        int[] fourthStudentScore = new int[4];

        System.out.println("Welcome Teacher, please enter the student numbers or enter (-1) to stop:");
        int studentCount = 1;
        for (int i = 0; i < 4; i++) {
            if (studentCount == 5) {
                System.out.println("You can now proceed to the subject aspect!!");
                System.out.println();
                break;
            }
            System.out.print("Enter student number for Student " + studentCount + ": ");
            studentNumber[i] = input.nextInt();
            studentCount++;
            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully\n");
        }

        System.out.println("Welcome Teacher, please enter the subject numbers or enter (-1) to stop:");
        int subjectCount = 1;
        for (int j = 0; j < 4; j++) {
            if (subjectCount == 5) {
                System.out.println("You can now proceed to score entry!!");
                System.out.println();
                break;
            }
            System.out.print("Enter subject number for Subject " + subjectCount + ": ");
            subjectNumber[j] = input.nextInt();
            subjectCount++;
            System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Saved successfully\n");
        }

        System.out.println("Enter scores for each student:");

        for (int l = 0; l < 4; l++) {
            System.out.printf("Enter score for Student 1, Subject %d: ", l + 1);
            firstStudentScore[l] = input.nextInt();
        }

        for (int l = 0; l < 4; l++) {
            System.out.printf("Enter score for Student 2, Subject %d: ", l + 1);
            secondStudentScore[l] = input.nextInt();
        }

        for (int l = 0; l < 4; l++) {
            System.out.printf("Enter score for Student 3, Subject %d: ", l + 1);
            thirdStudentScore[l] = input.nextInt();
        }

        for (int l = 0; l < 4; l++) {
            System.out.printf("Enter score for Student 4, Subject %d: ", l + 1);
            fourthStudentScore[l] = input.nextInt();
        }

        int firstStudentTotal = 0, secondStudentTotal = 0, thirdStudentTotal = 0, fourthStudentTotal = 0;
        for (int i = 0; i < 4; i++) {
            firstStudentTotal += firstStudentScore[i];
            secondStudentTotal += secondStudentScore[i];
            thirdStudentTotal += thirdStudentScore[i];
            fourthStudentTotal += fourthStudentScore[i];
        }

        float firstStudentAverage = (float) firstStudentTotal / 4;
        float secondStudentAverage = (float) secondStudentTotal / 4;
        float thirdStudentAverage = (float) thirdStudentTotal / 4;
        float fourthStudentAverage = (float) fourthStudentTotal / 4;

        System.out.println("=============================================================================================================");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "SUB4", "TOTAL", "AVERAGE");
        System.out.println("=============================================================================================================");
        System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%n", "Student 1", firstStudentScore[0], firstStudentScore[1], firstStudentScore[2], firstStudentScore[3], firstStudentTotal, firstStudentAverage);
        System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%n", "Student 2", secondStudentScore[0], secondStudentScore[1], secondStudentScore[2], secondStudentScore[3], secondStudentTotal, secondStudentAverage);
        System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%n", "Student 3", thirdStudentScore[0], thirdStudentScore[1], thirdStudentScore[2], thirdStudentScore[3], thirdStudentTotal, thirdStudentAverage);
        System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%n", "Student 4", fourthStudentScore[0], fourthStudentScore[1], fourthStudentScore[2], fourthStudentScore[3], fourthStudentTotal, fourthStudentAverage);
        System.out.println("=============================================================================================================");

        for (int subjectIndex = 0; subjectIndex < 4; subjectIndex++) {
            int totalScore = 0;
            int passCount = 0, failCount = 0;
            int highestSubjectScore = Integer.MIN_VALUE;
            int lowestSubjectScore = Integer.MAX_VALUE;
            int highestStudent = 0;
            int lowestStudent = 0;

            for (int student = 0; student < 4; student++) {
                int score = 0;
                switch (student) {
                    case 0: score = firstStudentScore[subjectIndex]; break;
                    case 1: score = secondStudentScore[subjectIndex]; break;
                    case 2: score = thirdStudentScore[subjectIndex]; break;
                    case 3: score = fourthStudentScore[subjectIndex]; break;
                }

                totalScore += score;

                if (score > highestSubjectScore) {
                    highestSubjectScore = score;
                    highestStudent = student + 1;
                }
                if (score < lowestSubjectScore) {
                    lowestSubjectScore = score;
                    lowestStudent = student + 1;
                }

                if (score >= 50) passCount++;
                else failCount++;
            }

            float averageScore = (float) totalScore / 4;

            System.out.println();
            System.out.println("SUBJECT SUMMARY");
            System.out.printf("Subject %d%n", subjectIndex + 1);
            System.out.printf("Highest Scoring Student is: Student %d with %d%n", highestStudent, highestSubjectScore);
            System.out.printf("Lowest Scoring Student is: Student %d with %d%n", lowestStudent, lowestSubjectScore);
            System.out.printf("Total Score is: %d%n", totalScore);
            System.out.printf("Average Score is: %.2f%n", averageScore);
            System.out.printf("Number of Passes: %d%n", passCount);
            System.out.printf("Number of Fails: %d%n", failCount);
        }

        int classTotalScore = firstStudentTotal + secondStudentTotal + thirdStudentTotal + fourthStudentTotal;
        float classAverageScore = (float) classTotalScore / 4;

        int bestGraduatingStudent = 0;
        int worstGraduatingStudent = 0;
        int highestTotal = Integer.MIN_VALUE;
        int lowestTotal = Integer.MAX_VALUE;

        int[] totalScores = {firstStudentTotal, secondStudentTotal, thirdStudentTotal, fourthStudentTotal};
        for (int i = 0; i < 4; i++) {
            if (totalScores[i] > highestTotal) {
                highestTotal = totalScores[i];
                bestGraduatingStudent = i + 1;
            }
            if (totalScores[i] < lowestTotal) {
                lowestTotal = totalScores[i];
                worstGraduatingStudent = i + 1;
            }
        }

        System.out.println();
        System.out.print("===================================================================");
        System.out.println("CLASS SUMMARY");
        System.out.print("==================================================================");
        System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestGraduatingStudent, highestTotal);
        System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstGraduatingStudent, lowestTotal);
        System.out.printf("Class Total Score is: %d%n", classTotalScore);
        System.out.printf("Class Average Score is: %.2f%n", classAverageScore);
    }
}

