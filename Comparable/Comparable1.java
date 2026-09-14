package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book> {

    private String title;
   
    public Book(String title){
        this.title = title;
    }

    public int compareTo(Book other){
        return this.title.compareTo(other.title);
    }
    public String toString() {
        return title;
    }
}
public class Comparable1 {
    public static void main(String[] args){
     
        List<Book> list = new ArrayList<>();
        
        list.add(new Book("Harry Potter"));
        list.add(new Book("Java"));
        list.add(new Book("Python"));
        list.add(new Book("C++"));
        
        Collections.sort(list);

        System.out.println(list);


    }
}
