public class ArraysFunctions {
    public static void main(String[] args) {
    
        arrayLargestElement(new int[]{1, 2, 3, 4, 5});
        
        reverseArray(new int[]{1, 2, 3, 4, 5});
        
        arrayElement(new int[]{1, 2, 3, 4, 5}, 3);
        
        oddArray(new int[]{1, 2, 3, 4, 5});
        
        evenArray(new int[]{1, 2, 3, 4, 5});
        
        totalRunningArray(new int[]{1, 2, 3, 4, 5});
        
        stringPalindrome("Daniel");
        
        numberToDigits(12345)
        
        
        
    }

    public static int arrayLargestElement(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int [] reverseArray(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean arrayElement(int[] numbers, int element) {
        for (int number : numbers) {
            if (number == element) {
                return true;
            }
        }
        return false;
    }

    public static int [] oddArray(int[] numbers) {
        int[] result = new int[(numbers.length + 1) / 2];
        int index = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            result[index++] = numbers[i];
        }
        return result;
    }

    public static int[] evenArray(int[] numbers) {
        int[] result = new int[numbers.length / 2];
        int index = 0;
        for (int i = 1; i < numbers.length; i += 2) {
            result[index++] = numbers[i];
        }
        return result;
    }

    public static int[] totalRunningArray(int[] numbers) {
        int[] result = new int[numbers.length];
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
            result[i] = total;
        }
        return result;
    }
    
    public static boolean stringPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int[] numberToDigits(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        return digits;
    }
}

}


