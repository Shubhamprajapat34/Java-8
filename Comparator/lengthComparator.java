package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String>{

    public int compare(String s1, String s2){

        return s1.length()-s2.length();
    }
}

public class lengthComparator {
    public static void main(String[] args){

        List<String> words = Arrays.asList("banana","apple","date");
        
        words.sort(new StringLength());

        System.out.println(words);
    }
}

