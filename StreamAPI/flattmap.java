package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class flattmap {
    
    public static void main(String[] args){
     
   /*  List<List<Integer>> numbers = Arrays.asList(
    Arrays.asList(10, 20),
    Arrays.asList(30, 40),
    Arrays.asList(50)
     );


    List<Integer> result = numbers.stream()
                               .flatMap(list -> list.stream())
                               .toList();


    System.out.println(result);
    }  */

    List<List<String>> name = Arrays.asList(
         Arrays.asList("shubham", " Rahul"),
         Arrays.asList("Rohit","Sujal"),
         Arrays.asList("Vikash","Vinod")
    );

    List<String> result = name.stream()
                              .flatMap(list -> list.stream())
                              .toList();


    System.out.println(result);

    }
}
