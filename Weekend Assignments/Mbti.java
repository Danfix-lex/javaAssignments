import java.util.Scanner;

public class Mbti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = input.nextLine();
        
        int countA[] = new int [4];
        int countB[] = new int [4];

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

        for (int questionNumber = 0; questionNumber < 4; questionNumber += 1) {
          for (int question = questionNumber; question < questions.length; question += 4) {
            System.out.println(questions[question][0]);
            System.out.println(questions[question][1]);

            System.out.print("Choose your answer (A or B): ");
            String userAnswer = input.nextLine();

            if (userAnswer.equalsIgnoreCase("A") || userAnswer.equalsIgnoreCase("B")) {
              if (userAnswer.equalsIgnoreCase("A")) {
                  countA[question]++;
                  System.out.println(questionNumber);
              } else if (userAnswer.equalsIgnoreCase("B")) {
                  countB[question]++;
                  System.out.println(questionNumber);
              }
            }
            else {
                  System.out.println("Error please choose a valid answer by selecting either (A) or (B): ");                  
              question -= 4;
            }
        }
      }
    
        
        System.out.println("Thank you for completing the MBTI test, " + name + "!");
    }
}

