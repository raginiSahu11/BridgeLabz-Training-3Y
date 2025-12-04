class CustomReplace {

    static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(
            replaceWord("Java is very easy", "easy", "powerful")
        );
    }
}
