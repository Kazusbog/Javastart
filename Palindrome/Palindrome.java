public class Palindrome{
    public static void main(String[] args) {
        String word = args[0];
        System.out.println(word);
        if (isPalindrome(word)) {
            System.out.println(word + " палиндром!");
            } else {
                System.out.println(word + " не палиндром :(");
            }      
    }

    public static boolean isPalindrome(String text) {
        int len = text.length();
        for (int i = 0; i < len / 2; i++) {
            if (text.charAt(i) != text.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
