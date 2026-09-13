package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class limit {

    public static void main(String[] args){
    List<Integer> numbers =
        Arrays.asList(10, 20, 30, 40, 50);

   /*List<Integer> result = numbers.stream()
                                 .limit(4)
                                 .toList();*/
  // System.out.println(result);

  numbers.stream()
         .limit(3)
         .forEach(System.out::println);    
        }
}
