package spellchecker;

public class SpellChecker {

    public static void main(String[] args) {
        String[] input = ("_ " + "Ang mga , tao din at ako" + " _").toLowerCase().split(" ");

        Initialize initialize = new Initialize();
        

//        for (int counter = 0; counter <= (input.length - 3); counter++) {
//
//            String left_word = input[counter];
//            String current_word = input[counter + 1];
//            String right_word = input[counter + 2];
//
//            // error detection - pass the current_word
//            if (inDictionary(current_word)) {
//                // DO NOTHING
//            } else {
//            // error correction    
//            }
//
//        }

    }

    /* 
     * Check whether the current is in the language or not. 
     * 
     * @param currentWord - current word of the sentence.
     * @return FALSE - if the word is not in the language.
     */
    private static boolean inDictionary(String currentWord) {
        // ignore not characters
        if (isWord(currentWord)) {
            // DICTIONARY LOOK-UP
            // N-GRAM

        }
        return false;
    }

    /* 
     * Check whether the current word contains only letters or not. 
     * 
     * @param currentWord - current word of the sentence.
     * @return FALSE - if the word has special character/number.
     */
    private static boolean isWord(String currentWord) {
        for (int i = 0; i < currentWord.length(); i++) {
            char charAt2 = currentWord.charAt(i);
            if (!Character.isLetter(charAt2)) {
                return false;
            }
        }
        return true;
    }
}
