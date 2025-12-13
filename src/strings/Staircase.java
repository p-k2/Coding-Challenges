 import java.util.* ;

    public class Staircase{

        
                 public static void staircase(int n) {
    // Write your code here
         for (int i = 1; i <= n; i++) {
        // print spaces
        for (int s = 0; s < n - i; s++) {
            System.out.print(" ");
        }
        // print hashes
        for (int h = 0; h < i; h++) {
            System.out.print("#");
        }
        System.out.println();
    }

        }
        
        public static void main(String[] args){
            staircase(4);

        }
    }