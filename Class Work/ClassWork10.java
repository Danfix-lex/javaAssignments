import java.util.Scanner;

public class ClassWork10 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("To start please Select an option:");
            System.out.println("1) Add");
            System.out.println("2) View");
            System.out.println("3) Delete");
            System.out.println("4) Quit");

            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1: Add(); break;
                case 4: Quit(); break;
            }
        }
    }

    public static void Add() {
        System.out.println("1) Add" );
        System.out.println("2) View");
        System.out.println("3) Delete");
        System.out.println("4) Quit");

        if (input.nextInt() == 1) {
            return;  
        } if (input.nextInt() == 2) {
            return;
          } if (input.nextInt() == 3) {
              return;          
            }
    }

    public static void Quit() {
        System.exit(4);
}
}

    
