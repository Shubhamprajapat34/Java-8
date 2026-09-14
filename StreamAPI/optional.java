package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optional {
   public static void main(String[] args){
    List <Integer> list = Arrays.asList(1,2,3,4,5,5,6,7);

    Optional<Integer> result = list.stream()
                                .filter(n -> n>2)
                                .findFirst();

     System.out.println(result);

     }
   }