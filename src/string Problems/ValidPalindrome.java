import java.util.*;
// leetcode: https://leetcode.com/problems/valid-palindrome/description/

public class ValidPalindrome {

  public static boolean isPalindrome(String s) {
    if (s == null) {
        return true; 
    }
    
    String t = s.toLowerCase();
    int left = 0;
    int right = t.length() - 1;

    while (left < right) {
    
        while (left < right && !Character.isLetterOrDigit(t.charAt(left))) {
            left++;
        }
        
        while (left < right && !Character.isLetterOrDigit(t.charAt(right))) {
            right--;
        }
    
        if (left < right) {
            if (t.charAt(left) != t.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
    }
    
    return true; 
}

    public static void main( String args[]){
        String s = ".," ;
        System.out.println(isPalindrome(s)) ;


    }
}