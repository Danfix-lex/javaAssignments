import java.util.Arrays;

public class TwoSortedArrays {
    public static void main(String[] args) {

        int[] array1 = {2, 6, 7};
        int[] array2 = {6, 8, 2};

        int[] combined = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            combined[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            combined[array1.length + i] = array2[i];
        }

        for (int i = 0; i < combined.length; i++) {
            for (int j = i + 1; j < combined.length; j++) {
                if (combined[j] < combined[i]) {
                    int temp = combined[j];
                    combined[j] = combined[i];
                    combined[i] = temp;
                }
            }
        }

        System.out.println("Sorted combined array: " + Arrays.toString(combined));
    }
}

