package mainApplication;

import geopolitical.GeoPolitical;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a state: ");
        String state = scanner.nextLine();

        String zone = GeoPolitical.getGeoPoliticalZone(state);
        
        if (zone != null) {
            System.out.println("The state " + state + " belongs to the " + zone + " geo-political zone.");
        } else {
            System.out.println("The state " + state + " is not recognized.");
        }
        
        scanner.close();
    }
}