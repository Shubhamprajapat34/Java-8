public class OwnInterface {

    interface Calculator{
        int calculate(int a, int b);
    }
    public static void main(String[] args){
        int a=40;
        int b=30;

        Calculator addition = (x,y) -> x+y;
        System.out.println(addition.calculate(a, b));

        Calculator substraction = (x,y) -> x-y;
        System.out.println(substraction.calculate(a,b));
         
        Calculator multiplication = (x,y) -> x*y;
        System.out.println(multiplication.calculate(a,b));

        Calculator division = (x,y) -> x/y;
        System.out.println(division.calculate(a, b));

    }
}
