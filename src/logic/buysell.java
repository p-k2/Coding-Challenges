    import java.util.* ;
    
    //Leetcode Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
    class buysell{


        public static void main(String args[]){
         int[] array = {7,6,4,3,1} ;

        System.out.println(profit(array)) ;
        }

         
    public static int profit(int[] prices){

      int maxprofit = 0;
      int bestBuy = prices[0] ;

      for(int i=1; i<prices.length ; i++){
        if( bestBuy < prices[i]){

            maxprofit = Math.max(maxrofit, (prices[i]- bestBuy)) ; //calculating max profit

        }

        bestBuy = Math.min(bestBuy , prices[i]) ;//updaing best buying day
      }
      return maxprofit ;
 
   }

    }