public class StringReverse {

    interface ReverseString{
        String reverse(String s);
    }
    public  static void main(String[] args){
        String s = "Hello";

        ReverseString R = (s1) -> {
            String rev = " ";
            for(int i=s1.length()-1; i>=0; i--){
                rev+=s1.charAt(i);
            }
            return rev;
        };

        System.out.println(R.reverse(s));
    }
}
