public class findSq {
    public interface Square {
        int sq(int a);
    }
    public static void main( String[] args){
      Square s = (a) -> a*a;
      System.out.println(s.sq(10)) ;
    }
}
