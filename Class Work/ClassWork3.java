import java.util.Scanner;

public class ClassWork3 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your age to check if you are eligible to either drive, vote or drink: ");    
    int age = input.nextInt();
      
    int drive = 16;
    int vote = 18;
    int drink = 21;

    if (age == 16 && age < 18){
      System.out.println("You are eligible to Drive");
    } if (age > 16 && age < 21 ){
        System.out.println("You are eligible to Drive and Vote");
      } if (age > 20){
          System.out.println("You are eligible to Drive, Vote and Drink");
        } if (age < 16){
            System.out.println("You are not eligible to Drive, Vote and Drink");
        } 
      }
    }

