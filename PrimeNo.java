public class PrimeNo {
    interface Prime{
        boolean check(int a);
    }
    public static void main(String[] args){
        int n=16;
       Prime p = (a)-> a%2==0 || a%3==0 ? false:true;
       System.out.println(p.check(n));
    }
}
