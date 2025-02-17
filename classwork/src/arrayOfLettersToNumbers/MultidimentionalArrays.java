package arrayOfLettersToNumbers;

import java.util.Arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] digits = new int[3][3];
        String[][] letters = {
                {"X", "O", "X"},
                {"X", "X", "O"},
                {"X", "O", "O"}
        };

        for (char i = 0; i < letters.length; i++) {
            for (char j = 0; j < letters[i].length; j++) {
                if (letters[i][j].equals("X")) {
                    digits[i][j] = 1;
                } else {
                    digits[i][j] = 0;
                }
            }
        }

        for (int[] digit : digits) {
            System.out.println(Arrays.toString(digit));
        }
    }
}