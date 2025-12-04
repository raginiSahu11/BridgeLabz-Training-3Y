class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int f : freq)
            if (f != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}
