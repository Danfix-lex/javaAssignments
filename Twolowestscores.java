import java.util.Scanner;

public class Twolowestscores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   	
	String lowestName = "";
        String secondLowestName = "";
        double lowestScore = Double.MAX_VALUE;
        double secondLowestScore = Double.MAX_VALUE;

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

    
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();
            System.out.print("Enter student score: ");
            double score = input.nextDouble();

            if (score < lowestScore) {
                secondLowestScore = lowestScore;
                secondLowestName = lowestName;

                lowestScore = score;
                lowestName = name;
            } else if (score < secondLowestScore) {
                secondLowestScore = score;
                secondLowestName = name;
            }
        }

        System.out.println("Student with the lowest score: " + lowestName);
        System.out.println("Student with the second lowest score: " + secondLowestName);
    }
}
