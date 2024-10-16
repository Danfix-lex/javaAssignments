import java.util.Scanner;
public class UserName {
    public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter your name: ");
		String name = input.nextLine();
	System.out.println("Hi " + name + " nice to meet you");
	System.out.print("Hi " + name + " nice to meet you ");
	System.out.printf("Hi %s nice to meet you", name);

	}
}