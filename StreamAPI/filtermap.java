package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class filtermap {
    
    public static void main(String[] args){
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List <Integer> processdata = list.stream()
                                         .filter(n -> (n%2!=0 && n%3!=0))
                                         .map(n -> n*2)
                                         .toList();
        System.out.println(processdata);
    }
}
