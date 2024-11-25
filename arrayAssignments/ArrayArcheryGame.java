import java.util.Random;

public class ArrayArcheryGame {
    public static void main(String[] args) {
        int[][] scores = new int[4][3];
        int[] totalScores = new int[4];
        Random random = new Random();
        int winner = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                int score = random.nextInt(11);
                scores[i][j] = score;
                totalScores[i] += score;
            }
            if (totalScores[i] > totalScores[winner]) {
                winner = i;
            }
        }

        System.out.println("Player\tChance 1\tChance 2\tChance 3\tTotal");
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.println(totalScores[i]);
        }

        System.out.println("Player " + (winner + 1) + " wins with a score of " + totalScores[winner]);
    }
}

