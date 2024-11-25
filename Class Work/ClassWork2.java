import java.util.Scanner;
  
  public class ClassWork2 {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the temperature (Celsius) to check if its cold, warm or hot: ");
      float temperature = input.nextInt();

      if (temperature <= 0 && temperature < 10) {
        System.out.println("The temperature is Cold");
      } 
      if (temperature > 10 && temperature <= 25) {
          System.out.println("The temperature is Warm");
        } else {
            System.out.println("The temperature is Hot");
    }  
  }
}
