public class HelloPrint {
    interface Hello{
        void sayHello();
    }
    public static void main(String[] args){
       Hello h =()-> System.out.println("Hello world");
       h.sayHello();
    }
}
