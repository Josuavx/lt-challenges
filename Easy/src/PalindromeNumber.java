//Leetcode Challenge Link: https://leetcode.com/problems/palindrome-number/

import java.util.Arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] digitos = String.valueOf(x).toCharArray();
        char contrario[] = new char[digitos.length];

        for (int i = 0; i < contrario.length; i++){
            contrario[i] = digitos[(contrario.length - 1) - i];
        }

        return Arrays.equals(digitos, contrario);
    }
}
