public class StringJoin {
    interface JoinString{
        String Join(String s1, String s2);
    }
    public static void main(String[] args){
     JoinString J = (s1,s2) -> s1+s2;
     System.out.println(J.Join("Hello","World"));

    }
}
