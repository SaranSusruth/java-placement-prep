package Strings;


public class StringPalindrome {
    public static void main(String[] args) {

        String str = "radar";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        if(reversed.equals(str))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not a palindrome");
        }
    }
}
