import java.util.Scanner;

public class Greatpyramidofgiza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the estimated number of stones used: ");
        long numberOfStones = input.nextLong();

        System.out.print("Enter the average weight of each stone (in tons): ");
        double averageWeightPerStone = input.nextDouble();

        System.out.print("Enter the number of years it took to build: ");
        int yearsToBuild = input.nextInt();

        double totalWeight = numberOfStones * averageWeightPerStone;

        double weightPerYear = totalWeight / yearsToBuild;

        double weightPerHour = weightPerYear / (365 * 24);

        double weightPerMinute = weightPerHour / 60;

        System.out.println("\nTotal weight of the pyramid: " + totalWeight + " tons");
        System.out.println("Weight built each year: " + weightPerYear + " tons");
        System.out.println("Weight built each hour: " + weightPerHour + " tons");
        System.out.println("Weight built each minute: " + weightPerMinute + " tons");

        input.close();
    }
}
