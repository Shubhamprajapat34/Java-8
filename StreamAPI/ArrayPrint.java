package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ArrayPrint {
    
    public static void main(String[] args){
        List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List <Integer> evenlist = list.stream()
                                     .filter(n -> n%2==0)
                                     .toList();


        System.out.println(evenlist);
    }
}

// if we use 
// .toList() then we need to use java 16 or above version.  It define inmuatable list we can change 
// If we use java 8 then we can use .collect(Collectors.toList()) instead of .toList() In that case we  can change the list.