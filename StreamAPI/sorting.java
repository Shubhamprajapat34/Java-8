package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class sorting {
  
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(9,4,8,3,6,7,2,1,2,4,8,9);

        List<Integer> sortedResult = list.stream()
                                         .sorted()
                                         .toList();
        
        System.out.println(sortedResult);
    }

}
