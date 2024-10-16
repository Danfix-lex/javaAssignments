import java.util.Scanner;

public class Occurenceofmaxnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers (end with 0):");

        int max = Integer.MIN_VALUE;  
        int count = 0;

        while (true) {
            int num = input.nextInt();  

            if (num == 0) {  
                break;
            }

            if (num > max) {
                max = num;   
                count = 1;   
            } 
	else if (num == max) {
                count++;     
            }
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0.");
        } 
	else {
            System.out.println("The largest number is " + max);
            System.out.println("The occurrence count of the largest number is " + count);
        }

        input.close();
    }
}
