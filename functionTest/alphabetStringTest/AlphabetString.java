public class AlphabetString {
    public static boolean hasAllAlphabets(String input) {
        if (input == null || input.isEmpty()) return false;

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            char c = alphabet.charAt(i);
            boolean found = false;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == c) {
                    found = true;
                    break;
                }
            }

            if (!found) return false;
        }

        return true;
    }
}

