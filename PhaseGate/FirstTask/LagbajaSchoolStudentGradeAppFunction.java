import java.util.Scanner;

public class LagbajaSchoolStudentGradeAppFunction {

    public static int[] calculateTotalScores(int[][] studentScores, int numStudents) {
        int[] totalScores = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < studentScores[i].length; j++) {
                totalScores[i] += studentScores[i][j];
            }
        }
        return totalScores;
    }

    public static float[] calculateAverages(int[] totalScores, int numStudents) {
        float[] averages = new float[numStudents];
        for (int i = 0; i < numStudents; i++) {
            averages[i] = (float) totalScores[i] / 4;
        }
        return averages;
    }

    public static String[] calculateRanks(float[] averages, int numStudents) {
        String[] ranks = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int rank = 1;
            for (int j = 0; j < numStudents; j++) {
                if (averages[j] > averages[i]) {
                    rank++;
                }
            }
            ranks[i] = String.valueOf(rank);
        }
        return ranks;
    }

    public static void printScoreTable(int[][] studentScores, int[] totalScores, float[] averages, String[] ranks) {
        System.out.println("=============================================================================================================");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "STUDENT", "SUB1", "SUB2", "SUB3", "SUB4", "TOT", "AVE", "POS");
        System.out.println("=============================================================================================================");
        for (int i = 0; i < totalScores.length; i++) {
            System.out.printf(
                "%-15s%-15d%-15d%-15d%-15d%-15d%-15.2f%-15s\n",
                "Student " + (i + 1),
                studentScores[i][0], studentScores[i][1], studentScores[i][2], studentScores[i][3],
                totalScores[i], averages[i], ranks[i]
            );
        }
        System.out.println("=============================================================================================================");
    }

    public static String calculateSubjectSummaries(int[][] studentScores, int numStudents) {
        String output = "";
        for (int subjectIndex = 0; subjectIndex < 4; subjectIndex++) {
            int totalScore = 0;
            int passCount = 0;
            int failCount = 0;
            int highestScore = Integer.MIN_VALUE;
            int lowestScore = Integer.MAX_VALUE;
            int highestStudent = 0;
            int lowestStudent = 0;

            for (int student = 0; student < numStudents; student++) {
                int score = studentScores[student][subjectIndex];
                totalScore += score;

                if (score > highestScore) {
                    highestScore = score;
                    highestStudent = student + 1;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                    lowestStudent = student + 1;
                }

                if (score >= 50) passCount++;
                else failCount++;
            }

            float averageScore = (float) totalScore / numStudents;

            output += "\nSUBJECT SUMMARY\n";
            output += String.format("Subject %d%n", subjectIndex + 1);
            output += String.format("Highest Scoring Student is: Student %d with %d%n", highestStudent, highestScore);
            output += String.format("Lowest Scoring Student is: Student %d with %d%n", lowestStudent, lowestScore);
            output += String.format("Total Score is: %d%n", totalScore);
            output += String.format("Average Score is: %.2f%n", averageScore);
            output += String.format("Number of Passes: %d%n", passCount);
            output += String.format("Number of Fails: %d%n", failCount);
        }
        return output;
    }

    public static String calculateClassSummary(int[] totalScores, int numStudents) {
        int classTotalScore = 0;
        int highestTotal = Integer.MIN_VALUE; 
        int lowestTotal = Integer.MAX_VALUE;
        int bestGraduatingStudent = 0;
        int worstGraduatingStudent = 0;

        for (int i = 0; i < numStudents; i++) {
            classTotalScore += totalScores[i];
            if (totalScores[i] > highestTotal) {
                highestTotal = totalScores[i];
                bestGraduatingStudent = i + 1;
            }
            if (totalScores[i] < lowestTotal) {
                lowestTotal = totalScores[i];
                worstGraduatingStudent = i + 1;
            }
        }

        float classAverageScore = (float) classTotalScore / numStudents;

        String output = "";
        output += "\n===================================================================\n";
        output += "CLASS SUMMARY\n";
        output += "===================================================================\n";
        output += String.format("Best Graduating Student is: Student %d scoring %d%n", bestGraduatingStudent, highestTotal);
        output += String.format("Worst Graduating Student is: Student %d scoring %d%n", worstGraduatingStudent, lowestTotal);
        output += String.format("Class Total Score is: %d%n", classTotalScore);
        output += String.format("Class Average Score is: %.2f%n", classAverageScore);

        return output;
    }

    public static int[][] collectStudentScores(int numStudents, int numSubjects) {
        Scanner input = new Scanner(System.in);
        int[][] studentScores = new int[numStudents][numSubjects];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + " (" + numSubjects + " subjects): ");
            for (int j = 0; j < numSubjects; j++) {
                studentScores[i][j] = Integer.parseInt(input.nextLine());
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved Successfully");
                System.out.println();
            }
        }
        return studentScores;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students that you want their grade to be recorded: ");
        int numStudents = Integer.parseInt(input.nextLine());


        System.out.println("Enter the number of subjects offered by each student: ");
        int numSubjects = Integer.parseInt(input.nextLine());
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved Successfully");
        System.out.println();
        int[][] studentScores = collectStudentScores(numStudents, numSubjects);

        int[] totalScores = calculateTotalScores(studentScores, numStudents);
        float[] averages = calculateAverages(totalScores, numStudents);
        String[] ranks = calculateRanks(averages, numStudents);

        printScoreTable(studentScores, totalScores, averages, ranks);

        String subjectSummaries = calculateSubjectSummaries(studentScores, numStudents);
        System.out.println(subjectSummaries);

        String classSummary = calculateClassSummary(totalScores, numStudents);
        System.out.println(classSummary);
    }
}

