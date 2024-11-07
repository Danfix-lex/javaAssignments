import java.util.Scanner;

public class Mbti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = input.nextLine();

        String[][] questions = {
            {"Question 1:\nA. Expanded Energy, Enjoy Groups", "B. Conserve Energy, Enjoy One-on-One"},
            {"Question 2:\nA. Interpret Literally", "B. Look for Meaning and Possibilities"},
            {"Question 3:\nA. Logical, Thinking, Questioning", "B. Empathetic, Feeling, Accommodating"},
            {"Question 4:\nA. Organized, Orderly", "B. Flexible, Adaptable"},
            {"Question 5:\nA. More Outgoing, Think Out Loud", "B. More Reserved, Think to Yourself"},
            {"Question 6:\nA. Practical, Realistic, Experiential", "B. Imaginative, Innovative, Theoretical"},
            {"Question 7:\nA. Candid, Straight Forward, Frank", "B. Tactful, Kind, Encouraging"},
            {"Question 8:\nA. Plan, Schedule", "B. Unplanned, Spontaneous"},
            {"Question 9:\nA. Seek many Tasks, Public Activities, Interaction with others", "B. Seek Private, Solitary Activities with quiet to concentrate"},
            {"Question 10:\nA. Standard, Usual, Conventional", "B. Different, Novel, Unique"},
            {"Question 11:\nA. Firm, Tend to criticize, Hold the Line", "B. Gentle, Tend to Appreciate, Conciliate"},
            {"Question 12:\nA. Regulated, Structured", "B. Easy-going, Live and Let Live"},
            {"Question 13:\nA. External, Communicative, Express Yourself", "B. Internal, Reticent, Keep to Yourself"},
            {"Question 14:\nA. Focus on Here-and-Now", "B. Look to the Future, Global Perspective"},
            {"Question 15:\nA. Tough-Minded, Just", "B. Tender-Hearted, Merciful"},
            {"Question 16:\nA. Preparation, Plan ahead", "B. Go with the Flow, Adapt as you go"},
            {"Question 17:\nA. Active, Initiative", "B. Reflective, Deliberate"},
            {"Question 18:\nA. Facts, Things, What is", "B. Ideas, Dreams, What Could be, Philosophical"},
            {"Question 19:\nA. Matter of Fact, Issue-Oriented", "B. Sensitive, People-Oriented, Compassionate"},
            {"Question 20:\nA. Control, Govern", "B. Latitude, Freedom"}
        };

        char[] answers = {'A', 'B'};

        for (int questionNumber = 0; questionNumber < questions.length; questionNumber += 1) {

            System.out.println(questions[questionNumber][0]);
            System.out.println(questions[questionNumber][1]);

            System.out.print("Choose your answer (A or B): ");
            char userAnswer = input.nextLine().toUpperCase().charAt(0);

            if (userAnswer != 'A' && userAnswer != 'B') {
                System.out.print("Invalid answer. Please choose either A or B: ");
                userAnswer = input.nextLine().toUpperCase().charAt(0);
            }
        }
    
        
        System.out.println("Thank you for completing the MBTI test, " + name + "!");
    }
}

