import java.util.*;

    //Leetcode: https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class LongestSubstring{

     public static int lengthOfLongestSubstring(String s) {

        //base case : empty string or string with one char 
        if(s.length() <=1){
            return s.length();
        }


         int length = 0;
         int i=0;  // first loop variable
         int subString =i; // substring starting index

         for( int j=1; j< s.length() ; j++){
           int currLength =0;
            i = subString ; 
                
            while( i<j){
                
                if( s.charAt(i) == s.charAt(j) ){
                subString =i+1 ;
                currLength = 0;
                break ;
                }    
                i++;
            }
            currLength = j- subString +1;
            length = Math.max( length , currLength) ;
              
            
         }
         return length>0? length : 1 ;
        
    }

    public static void main(String args[]){
        String str = "abcabcbb" ;

        System.out.println(lengthOfLongestSubstring(str)) ;

    }
}
