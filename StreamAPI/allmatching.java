package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class allmatching {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,6,7,4,3,3,4,8,9);

        boolean result = list.stream().allMatch(n -> n < 0);

        System.out.println(result);
        
    }
}
