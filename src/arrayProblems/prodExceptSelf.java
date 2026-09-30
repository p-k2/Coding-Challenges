import java.util.* ;

    //leetcode link: https://leetcode.com/problems/product-of-array-except-self/description/
public class prodExceptSelf{

public static int[] productExceptSelf(int[] nums) {
        
        int n = nums.length ;
        int[] prod = new int[n] ;
        int product =1;
        boolean firstZero = false; 
        for( int i=0; i<n; i++){
            if(nums[i] == 0 && firstZero == false){
                firstZero = true;
                continue;
            }
            product *= nums[i] ;
        }

        for( int i=0; i<n; i++){
            if(firstZero== true && product ==0){

                 prod[i] = 0 ;
              
            }else if(firstZero == true && product !=0){
                 if(nums[i]==0 ){
                    prod[i]= product;
                }else {
                    prod[i] =0;
                }
            }else if(firstZero == false){
                 prod[i] = product/nums[i] ;

            }
           
        }

        return prod ;
    }

    public static void main(String[] args){

        int[] arr = {-1,1,0,3,-3} ;
       int[] prod=  productExceptSelf(arr );
       for( int i=0; i<prod.length; i++){
        System.out.println( prod[i]+ ", ");
       }
    }
}