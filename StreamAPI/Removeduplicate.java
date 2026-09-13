package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Removeduplicate {
    
   public static void main(String[] args){
 
     List <Integer> list = Arrays.asList(1,2,3,3,4,4,8,8,5,9,7,7);
     List <Integer> result = list.stream()
                                 .distinct()
                                 .toList();

    
    System.out.println(result);
   }
}
