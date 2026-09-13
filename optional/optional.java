package optional;

import java.util.Optional;

public class optional {

        public static void main(String[] args) {

        Optional<String> name =
                Optional.of("shubham");

        System.out.println(name);
    }
}

// optional.of use only when we know that value is not null