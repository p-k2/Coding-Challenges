import java.util.*;

//leetcode: https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

public class RemoveOccurences{



    public static String removeOccurrences(String s, String part) {
    StringBuilder sb = new StringBuilder(s);
    int index;
    
    
    while ((index = sb.indexOf(part)) != -1) {
 
        sb.delete(index, index + part.length());
    }
    
    return sb.toString();
}

public static void main(String args[]) {
    String s = "wwwwwwwwwwwwwwwwwwwwwvwwwwswxwwwwsdwxweeohapwwzwuwajrnogb";
    String part = "w";
    String removed = removeOccurrences(s, part);
    System.out.println(removed); // ਆਉਟਪੁੱਟ: vxsdxsdxeeohapzuajrnogb
}

}