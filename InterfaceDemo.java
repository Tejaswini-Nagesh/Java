interface Demo{
     void show();
    int a=10;
    default void newone(){
        System.out.println("This is default method in interface...");
    }
}
interface A{
    int b=20;
}
class Test implements Demo,A{
   public void  show(){
        System.out.println("this is show method");
            int result=a+b;
    System.out.println(result);

    }
  
}
class InterfaceDemo  {
    public static void main(String s[]){
    Test t1=new Test();
    t1.show();
    t1.newone();
    }



}