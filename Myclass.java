/*interface Parent{
    default void sayHello(){
        System.out.println("Helloo....");
    }


}
class Child implements Parent{
    @Override
    public  void sayHello(){
        System.out.println("Hello from child....");
    }

}
public class Myclass{
    public static void main(String s[]){
        Child c=new Parent();
        c.sayHello();
    }

}*/
interface A{
default void sayHello(){
    System.out.println("A says Hello..");
}
}
interface B{
    default void sayHello(){
        System.out.println("B says Hello..");
    }

}
public class Myclass implements A,B{
    public static void main(String s[]){
        Myclass myclass=new Myclass();
        myclass.sayHello();
    }
    @Override
    public void sayHello(){
       // System.out.println("my own implentation");
       B.super.sayHello();
    }
}