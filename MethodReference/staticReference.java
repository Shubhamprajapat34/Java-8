package MethodReference;

import java.util.function.Consumer;

public class staticReference {
    static void printMessage(String message){
        System.out.println(message);
    }
    public static void main(String[] args){
    
        Consumer<String> consumer = staticReference::printMessage;

        consumer.accept("Hello java");
 
    }
}