import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your weight(kilograms): ");
        double weight = input.nextDouble();
        
        System.out.print("Enter your height(meters): ");
        double number = input.nextDouble();
        
        double height = number * number;
        
        double bmi = weight / height;
       
    System.out.println(bmi);       
       
    }
}
