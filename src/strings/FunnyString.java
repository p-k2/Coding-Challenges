import java.util.* ;
    //Problem Link : https://www.hackerrank.com/challenges/funny-string/problem 
    public class FunnyString{

        public static String funnyString(String s) {
            
            int n = s.length();
            for(int i=1 ; i< n ; i++){ //start loop from index 1 

                int diff = Math.abs( s.charAt(i)- s.charAt(i-1)) ;  // difference of adjacent string chars
                int revDiff = Math.abs(s.charAt(n-i) - s.charAt(n-i-1)) ; //difference of reversed string chars

                if( diff != revDiff ){ // check the condition
                    return "Not Funny" ;
                }
            }
            return "Funny" ;

    }

        public static void main(String[] args){
                String s1 = "acxz" ;
                String s2 = "bcxz" ;

                System.out.println(funnyString(s1));
                System.out.println(funnyString(s2));


        }
    }