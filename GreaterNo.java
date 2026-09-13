public class GreaterNo {
    public interface Greater{
        int greater (int a, int b);
    }
    public static void main(String[] args){
     Greater g = (a,b) -> a>b?a:b;
     System.out.println(g.greater(60, 40));
    }
}
