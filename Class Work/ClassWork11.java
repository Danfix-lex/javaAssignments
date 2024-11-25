import java.util.Scanner;  

  public class ClassWork11 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter your number: ");
      int number = input.nextInt();

      for(int j = 1; j <= number; j = j + 1){
        
          for(int i = 1; i <= j; i = i + 1){
            System.out.print(i);
          }
          System.out.println();
        }
        for(int j = number - 1; j >= 1; j = j - 1){
        
          for(int i = 1; i <= j; i = i + 1){
            System.out.print(i);
          }
          System.out.println();
    }
  }
}
