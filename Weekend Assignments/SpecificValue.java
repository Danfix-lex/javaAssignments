public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; 
        int target = 3; 

        boolean found = false; 

        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found it!");
        } else {
            System.out.println("Not found.");
        }
    }
}

