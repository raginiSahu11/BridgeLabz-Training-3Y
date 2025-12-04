class LexicographicalCompare {

    static void compare(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        int result = 0;

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (result == 0 && s1.length() != s2.length())
            result = s1.length() - s2.length();

        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s2 + " comes before " + s1);
        else
            System.out.println("Both strings are equal");
    }

    public static void main(String[] args) {
        compare("apple", "banana");
    }
}
