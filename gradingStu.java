import java.util.* ;

class gradingS {

    public static List<Integer> gradingDtudents( List<Integer> grades){
        int n = grades.size();
        int[] arrResult = new int[n] ;
        for(int i =0 ; i<n ; i++){
            int mark = grades.get(i) ;
            if(mark < 38){
                 arrResult[i] = mark ;
                continue ;
            }
            int mul5 = (mark + ( 5- (mark%5))) ;
            if((mul5 - mark )< 3){
                 arrResult[i]= mul5 ;

            }else{
                arrResult[i] = mark ;
                
            }

        }
        List<Integer> result =  Arrays.stream( arrResult).boxed().toList();
        return result ;

       
    }
    public static void main( String[] args){
          List<Integer> list = new ArrayList<>(); // dynamic resizing internally

        // Adding elements one by one
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);

        System.out.println(gradingDtudents(list));
   
    }
}