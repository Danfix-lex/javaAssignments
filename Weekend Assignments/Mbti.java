import java.util.Scanner;
import java.util.Arrays;

public class Mbti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        
        
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.println("Hello" + " " + firstName + " " + lastName + " " + "Welcome");

        int countA[] = new int[4];
        
        int countB[] = new int[4];
        
        int countC[] = new int[4];

        String[][] questions = {
            {"Question 1:\nA. Expanded Energy, Enjoy Groups", "B. Conserve Energy, Enjoy One-on-One", "C. name"},
            {"Question 2:\nA. Interpret Literally", "B. Look for Meaning and Possibilities", "C. name"},
            {"Question 3:\nA. Logical, Thinking, Questioning", "B. Empathetic, Feeling, Accommodating", "C. name"},
            {"Question 4:\nA. Organized, Orderly", "B. Flexible, Adaptable", "C. name"},
            {"Question 5:\nA. More Outgoing, Think Out Loud", "B. More Reserved, Think to Yourself", "C. name"},
            {"Question 6:\nA. Practical, Realistic, Experiential", "B. Imaginative, Innovative, Theoretical", "C. name"},
            {"Question 7:\nA. Candid, Straight Forward, Frank", "B. Tactful, Kind, Encouraging", "C. name"},
            {"Question 8:\nA. Plan, Schedule", "B. Unplanned, Spontaneous", "C. name"},
            {"Question 9:\nA. Seek many Tasks, Public Activities, Interaction with others", "B. Seek Private, Solitary Activities with quiet to concentrate", "C. name"},
            {"Question 10:\nA. Standard, Usual, Conventional", "B. Different, Novel, Unique", "C. name"},
            {"Question 11:\nA. Firm, Tend to criticize, Hold the Line", "B. Gentle, Tend to Appreciate, Conciliate", "C. name"},
            {"Question 12:\nA. Regulated, Structured", "B. Easy-going, Live and Let Live", "C. name"},
            {"Question 13:\nA. External, Communicative, Express Yourself", "B. Internal, Reticent, Keep to Yourself", "C. name"},
            {"Question 14:\nA. Focus on Here-and-Now", "B. Look to the Future, Global Perspective", "C. name"},
            {"Question 15:\nA. Tough-Minded, Just", "B. Tender-Hearted, Merciful", "C. name"},
            {"Question 16:\nA. Preparation, Plan ahead", "B. Go with the Flow, Adapt as you go", "C. name"},
            {"Question 17:\nA. Active, Initiative", "B. Reflective, Deliberate", "C. name"},
            {"Question 18:\nA. Facts, Things, What is", "B. Ideas, Dreams, What Could be, Philosophical", "C. name"},
            {"Question 19:\nA. Matter of Fact, Issue-Oriented", "B. Sensitive, People-Oriented, Compassionate", "C. name"},
            {"Question 20:\nA. Control, Govern", "B. Latitude, Freedom", "C. name"}
        };

        for (int questionNumber = 0; questionNumber < 4; questionNumber++) {
            for (int question = questionNumber; question < questions.length; question += 4) {
            
                System.out.println(questions[question][0]);
                
                System.out.println(questions[question][1]);
                
                System.out.println(questions[question][2]);

                System.out.print("Choose your answer (A or B or C): ");
                String userAnswer = input.nextLine();

                if (userAnswer.equalsIgnoreCase("A") || userAnswer.equalsIgnoreCase("B") || userAnswer.equalsIgnoreCase("C")) {
                    if (userAnswer.equalsIgnoreCase("A")) {
                        countA[questionNumber]++;
                        
                    } else if (userAnswer.equalsIgnoreCase("B")) {
                        countB[questionNumber]++;
                    
                } else if (userAnswer.equalsIgnoreCase("C")) {
                        countC[questionNumber]++;
                } else {
                    System.out.println("Error: please choose a valid answer by selecting either (A) or (B) or (C).");
                    question -= 4;
                }
            }
        }

        String[] optionsA = {"E", "S", "T", "J"};
        String[] optionsB = {"I", "N", "F", "P"};
        String[] optionsC = {"N", "A", "M", "E"};
        String mbtiType = "";

        for (int i = 0; i < 4; i++) {
          if (countA[i] > countB[i]) { 
            mbtiType += optionsA[i];
          } else if (countB[i] > countC[i]) {
              mbtiType += optionsB[i];
            } else {
                mbtiType += optionsC[i];
            }
        }


        System.out.println("Thank you for completing the MBTI test, " + firstName + " " + lastName + "!");
        System.out.println("Your MBTI personality type is: " + mbtiType);

        System.out.println("\nExplanation of your MBTI type:");
            
            System.out.println("Number of A Chose is: " + countA[questionNumber]);
            System.out.println("Number of B Chosen is: " + countB[questionNumber]);
            System.out.println("Number of C Chosen is: " + countC[questionNumber]);
            
        for (int i = 0; i < mbtiType.length(); i++) {
          char personality = mbtiType.charAt(i);
          switch (personality) {
            case 'E':
              System.out.println("E Extraverted - Focused on the outer world, enjoys interacting with others.");
              break;
            case 'I':
              System.out.println("I Introverted - Focused on the inner world, prefers solitude.");
              break;
            case 'S':
              System.out.println("S Sensing - Focuses on facts and present realities.");
              break;
            case 'N':
              System.out.println("N Intuitive - Focuses on possibilities and abstract ideas.");
                break;
            case 'T':
              System.out.println("T Thinking - Makes decisions based on logic and analysis.");
              break;
            case 'F':
              System.out.println("F Feeling - Makes decisions based on values and empathy.");
              break;
            case 'J':
              System.out.println("J Judging - Prefers order, structure, and planning.");
              break;
            case 'P':
              System.out.println("P Perceiving - Prefers flexibility and going with the flow.");
              break;
            default:
              System.out.println("Invalid MBTI type.");
    }
}
            }
        }
      }

