public class stringlength {
    interface StringLength {
        int length( String s);
    }
    public static void main(String[] args){
      StringLength S = (s) -> s.length();
      System.out.println(S.length("Hello"));
    }
}
