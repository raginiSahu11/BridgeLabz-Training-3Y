class MostFrequentChar {

    static void mostFrequent(String s) {
        int max = 0;
        char result = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }

            if (count > max) {
                max = count;
                result = s.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: " + result);
    }

    public static void main(String[] args) {
        mostFrequent("success");
    }
}
