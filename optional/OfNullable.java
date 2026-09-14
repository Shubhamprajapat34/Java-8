package optional;

import java.util.Optional;

public class OfNullable {
    
    public static void main(String[] args) {
        
    String name = "shubham";

    Optional<String> result = Optional.ofNullable(name);

    System.out.println(result);   
    }
}