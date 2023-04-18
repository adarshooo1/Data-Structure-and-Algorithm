package Array;

public class Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "qwertyuioplkjhgfdsazxcvbnm";
        boolean checker = checkIfPangram(sentence);
        System.out.println(checker);
    }
    static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
