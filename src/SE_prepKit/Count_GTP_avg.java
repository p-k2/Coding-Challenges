import java.util.* ;

//Probem Link: https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/count-elements-greater-than-previous-average/problem?isFullScreen=true
public class Count_GTP_avg{

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {

    if (responseTimes == null || responseTimes.size() <= 1) {
        return 0;
    }

    int count = 0;
    long sum = responseTimes.get(0); // long to prevent overflow

    for (int i = 1; i < responseTimes.size(); i++) {
        int curResponse = responseTimes.get(i);

        
        if ((long) curResponse * i > sum) {
            count++;
        }

        sum += curResponse;
    }

    return count;
}


    public  static void main(String[] args){
        List<Integer> rT = new ArrayList<>();
        rT.add(0);
        // rT.add(200);
        // rT.add(150);
        // rT.add(300);
        System.out.println(countResponseTimeRegressions(rT) ) ;
    }
}