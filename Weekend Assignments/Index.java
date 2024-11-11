public class Index {
    public static void main(String[] args) {
        
        int[] numbers = {15, 20, 35, 40, 50};

        int target = 35;
        
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i; 
                break; 
            }
        }
        if (index != -1) {
            System.out.println("The index of " + target + " is: " + index);
        } else {
            System.out.println("The target number " + target + " is not in the array.");
        }
    }
}

