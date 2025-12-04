class RemoveDuplicates {

    static String removeDuplicates(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (result.indexOf(ch) == -1)
                result += ch;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}
