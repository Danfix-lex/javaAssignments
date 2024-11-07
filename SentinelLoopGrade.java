import java.util.Scanner;

  public class SentinelLoopGrade {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
        int count = 0;
        
        while (count != -1) { 
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
                System.out.print("Do you wish to continue? '0' for Yes or '-1' No: ");
                count = input.nextInt();
      }
    }
  }
