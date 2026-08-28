import java.util.* ;

//Leetcode Link: https://leetcode.com/problems/find-missing-and-repeated-values/description/

class MissingRepeating{

    public static void main(String[] args){
       int[][]  grid = {{9,1,7},{8,9,2},{3,4,6}};
        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println(result) ;

    }

     public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int size = grid.length ;
        int N = size*size ;
        int missing =0;
        int repeated =0;
        int actualSum =0;
        int expectedSum = (int)((N*(N+1))/2) ;

        Set<Integer> s = new HashSet<Integer>() ;

        for(int i=0 ; i< size ; i++){
            for( int j=0; j< size;j++){
                actualSum+= grid[i][j] ;
                    if(s.contains(grid[i][j])){
                        repeated = grid[i][j] ;
                    }
                    s.add(grid[i][j]);
            }
        }
    

        missing = expectedSum+repeated-actualSum ;
         return  new int[] {repeated, missing} ;
        
    }
}