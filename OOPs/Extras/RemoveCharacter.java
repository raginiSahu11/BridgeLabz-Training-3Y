class RemoveCharacter {

    static String removeChar(String s, char remove) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != remove)
                result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeChar("Hello World", 'l'));
    }
}
