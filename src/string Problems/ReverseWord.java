import java.util.*;

//leetcode: https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWord{

        public static String reverseWords(String s) {
        if(s.length() ==1 ){
            return s;
        }

        String[] split = s.trim().split(" ") ; // split words

        StringBuilder str = new StringBuilder() ;
        //add words from array end 
        for( int i =(split.length-1); i>=0; i--){

             if(split[i] == ""){ //for multiple spaces
                continue ;
            }
            str.append( split[i].trim());
            if( i ==0){ // for last word
                continue ;
            }
            str.append(" ") ;
        }

      

        return str.toString() ;

     }

     public static void main( String args[] ){
        
        String str = "a good   example" ;
        String rev = reverseWords(str) ;
        System.out.println( rev) ;

     }
}