import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        
        System.out.print("Enter the fourth number: ");
        int num4 = input.nextInt();
        
        System.out.print("Enter the fifth number: ");
        int num5 = input.nextInt();
        
        System.out.print("Enter the sixth number: ");
        int num6 = input.nextInt();
        
        System.out.print("Enter the seventh number: ");
        int num7 = input.nextInt();
        
        System.out.print("Enter the eight number: ");
        int num8 = input.nextInt();
        
        System.out.print("Enter the ninth number: ");
        int num9 = input.nextInt();
        
        System.out.print("Enter the tenth number: ");
        int num10 = input.nextInt();

        int largestOne = num1;  
        if (num2 > largestOne) {
            largestOne = num2;  
        }
        if (num3 > largestOne) {
            largestOne = num3;  
        }
        if (num4 > largestOne) {
            largestOne = num4;
        }
        if (num5 > largestOne) {
            largestOne = num5;
        }
        if (num6 > largestOne) {
            largestOne = num4;
        }
        

        int largestTwo = num2;  
        if (num2 > largest) {
            largest = num2;  
        }
        if (num3 > largest) {
            largest = num3;  
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
