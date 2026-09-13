public class oddeven {
    
    @FunctionalInterface 
    public interface oddEven{
        boolean check(int a);
    }
    public static void main(String[] args){
        oddEven o = (a) -> a%2==0;
        System.out.println(o.check(3));
    }

}
