public class FirstLetterCapital {
    public static String hasAllFirstCapitalLetter(String sentence) {
        if (sentence == null || sentence.isEmpty()) 
            return null;

        String[] sentenceSplit = sentence.split(" ");
        
        for (int i = 0; i < sentenceSplit.length; i++) {
            String word = sentenceSplit[i];
            sentenceSplit[i] = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }

        return String.join(" ", sentenceSplit);
    }
}

