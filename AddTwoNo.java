public class AddTwoNo {
   
    @FunctionalInterface
    public interface Add{
       int add(int a, int b);
    }
    public static void main(String[] args){
        Add sum = (a,b) -> a+b;
        System.out.println(sum.add(10,20));
    }
}
