import java.util.Scanner;

  public class SwitchCaseGrade {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter grade score: ");
        
        int class_grade = input.nextInt();
      
      switch (class_grade) {  
      
        case 100 ->
          System.out.println("Your score is: A");
          
        case 70 ->
          System.out.println("Your score is: B");
      
        case 50 ->
          System.out.println("Your score is: C");
      
          
      default ->
          System.out.println("Well done");
        }
    }         
}          
      
