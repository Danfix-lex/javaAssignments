import java.util.Scanner;

public class ElegibilityCheck {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your age: ");    
    int age = input.nextInt();
      
    String child = "0 - 12";
    String teen = "13 - 17";
    String adult = "18 - 64";
    String senior = "65 and above";

    if (age >= 0 && age <= 12){
      System.out.println("You are a Child, and your age is between:" + child);
    } if (age >= 13 && age <= 17){
        System.out.println("You are a Teen, and your age is between:" + teen);
      } if (age >= 18 && age <= 64){
          System.out.println("You are an Adult, and your age is between:" + adult);
        } if (age >= 65){
            System.out.println("You are a Senior, and your age is between:" + senior);
          }
    }
}

