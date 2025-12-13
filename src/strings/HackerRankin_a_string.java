import java.util.* ;

 // Problem Link: https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

    public class HackerRankin_a_string{

        public static  String hackerrankInString(String s) {
            
            String target = "hackerrank" ;
            String reversed = new StringBuilder(target).reverse().toString(); // reversing the target string

            Stack<Character> st = new Stack<>() ;
             for (char c : reversed.toCharArray()){ // pushing reversed string to a stack
                st.push(c);
             }

             for ( char ch : s.toCharArray()){
               if( !st.isEmpty() &&  ch == st.peek()){ //pop stack on a match
                    st.pop();
                }
             }
             if(st.isEmpty()){
                 return "YES" ;
             }else{
                return "NO" ;
             }
             

    }

        public static void main(String[] args){
             String s = "haacckkerrrankk" ;
             String s1 = "haacckkrankk" ;

            System.out.print(hackerrankInString(s)) ;
            System.out.print(hackerrankInString(s1)) ;

        }
    }