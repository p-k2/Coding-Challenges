import java.util.* ;
    public class Plus_Minus_problem{

         public static void plusMinus(List<Integer> arr) {
         // Write your code here
        int n = arr.size() ;
        int negCount =0;
        int posCount =0;
        int zeroCount =0;
        for(int i =0; i<n;i++){
            int element = arr.get(i) ;

          if (element > 0) posCount++;
            else if (element < 0) negCount++;
            else zeroCount++;
        }
    
        double rPos =( double)posCount/n  ;
        double rNeg =( double)negCount/n  ;
        double rZero =( double)zeroCount/n ;

            System.out.printf("%.6f", rPos) ;
            System.out.println() ;
            System.out.printf("%.6f", rNeg) ;
            System.out.println() ;
            System.out.printf("%.6f", rZero ) ;
            System.out.println() ;

          }

        public static void main(String args[]){

            List<Integer> arr = new ArrayList<Integer>() ;

            arr.add(1) ;
            arr.add(1) ;
            arr.add(0) ;
            arr.add(-1) ;
            arr.add(-1) ;

            plusMinus( arr);
    
        }
    }