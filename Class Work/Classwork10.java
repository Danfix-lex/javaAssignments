import java.util.Scanner;

public class ClassWork10 {
    static Scanner nokia = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("Please select among these menu to proceed: ");
            System.out.println("To start please Select an option:");
            System.out.println("1. Add");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("10. Quit");

            int menu = nokia.nextInt();
            nokia.nextLine();

            switch (menu) {
                case 1: Add(); break;
                case 2: View(); break;
                case 3: Delete(); break;
                case 4: Quit(); break;
                default: invalidOption(); break;
            }
        }
    }

    public static void call() {
        System.out.println("Dialing number!!!");
        System.out.println("0. Back to Main Menu");

        if (nokia.nextInt() == 0) {
            return;  
        }
    }
