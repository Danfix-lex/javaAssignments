import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int dayNumber = input.nextInt();

        String dayName;
        if (dayNumber == 1) {
            dayName = "Sunday";
        } else if (dayNumber == 2) {
            dayName = "Monday";
        } else if (dayNumber == 3) {
            dayName = "Tuesday";
        } else if (dayNumber == 4) {
            dayName = "Wednesday";
        } else if (dayNumber == 5) {
            dayName = "Thursday";
        } else if (dayNumber == 6) {
            dayName = "Friday";
        } else if (dayNumber == 7) {
            dayName = "Saturday";
        } else {
            dayName = "Invalid input";
        }

        System.out.println(dayName);
    }
}

