
//to calculte x^n with miminum time complexity
public class Power{

    public static double myPow(double x , int n){ 
     long N = n; // Convert to long to avoid overflow
        if (N == 0) return 1;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double half = myPow(x, (int)(N / 2));

        if (N % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }

    }

    public static void main(String[] args){
  double a =34.0005 ;
        int b = -3 ;
        System.out.println(Poweroptimal(a,b) );
    }

}
