package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
 
class Product {

    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
/* 
class NameComparator implements Comparator<Product>{
    
    public int compare(Product p1,Product p2){
    return p1.getName().compareTo(p2.getName());
    }
}
*/
public class comparator1 {
    
    public static void main(String[] args){

        List<Product> list = new ArrayList<>();
        

       list.add(new Product(103, "Laptop"));
       list.add(new Product(101, "Phone"));
       list.add(new Product(102, "Keyboard"));
         
    
        //  Sort using a Lambda Expression (No separate class needed!)
         list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println(list);
    }
}
