import java.util.*;

 //leetcode: https://leetcode.com/problems/string-compression/description/

public class StringCompression{

public static int compress(char[] chars) {
    // Edge Case: If the array is empty or has 1 element, no compression needed
    if (chars == null || chars.length == 0) {
        return 0;
    }
    if (chars.length == 1) {
        return 1;
    }

    int writeIdx = 0; // Pointer to write the compressed results into the original array
    int readIdx = 0;  // Pointer to scan through the array

    while (readIdx < chars.length) {
        char currentChar = chars[readIdx];
        int count = 0;

        // Count all consecutive occurrences of the current character
        while (readIdx < chars.length && chars[readIdx] == currentChar) {
            readIdx++;
            count++;
        }

        // 1. Write the character itself
        chars[writeIdx] = currentChar;
        writeIdx++;

        // 2. Write the count only if it's greater than 1
        if (count > 1) {
            String countStr = Integer.toString(count);
            for (int i = 0; i < countStr.length(); i++) {
                chars[writeIdx] = countStr.charAt(i);
                writeIdx++;
            }
        }
    }

    // Return the new length of the compressed array
    return writeIdx;
}

    

    public static void main( String[] args){
        char[] chars = {'a','b','b','b','b', 'c','c','c'};
        System.out.println(compress(chars)) ;

    }

}