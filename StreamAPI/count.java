package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class count {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        long Count = numbers.stream()
                               .filter(n -> n > 4)
                               .count();

    System.out.println(Count);
    }

}
