package Comparable;
import java.util.*;
class Product implements Comparable<Product>{

   private int Id;
   private String name;

   public Product(int Id, String name){
    this.Id=Id;
    this.name = name;
   }
   public int getId() 
   { 
      return Id;
     }

   public String getName()
    { 
        return name; 
    }
    
    public int compareTo(Product other)
    {
        return Integer.compare(this.Id, other.Id);
    }

     public String toString() {
        return "Product{id=" + Id + ", name='" + name + "'}";
    }
}
public class comparable {
    public static void main(String[] args){
     List<Product> list =new ArrayList<>();
     
     list.add(new Product(104,"MacBook Air"));
     list.add(new Product(103, "Laptop"));
     list.add(new Product(101, "Phone"));

     Collections.sort(list); 

     System.out.println(list);
      
    }
}
