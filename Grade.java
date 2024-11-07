import java.util.Scanner;

  public class Grade {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter grade: ");
      int class_grade = input.nextInt();
      
      if (class_grade < 50){
        System.out.println("D");
        }if (class_grade >= 50 && class_grade <= 60){
          System.out.println("C");
          }if (class_grade > 60 && class_grade <= 80){
        System.out.println("B");
            }if (class_grade > 80 && class_grade <= 100){
        System.out.println("A");
        }
    }
}
