class LongestWord {

    static String findLongest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(findLongest("Java is very powerful language"));
    }
}
