/*@FunctionalInterface
interface Addition{
void add(int a,int b);
public static final int a=10;
public static final int b=10;

public static class A{

}
public default void m1(){

}
public default void m2(){
    
}

private static void m4(){


}
private void m7(){}

public abstract int hashCode();
public abstract boolean equals(Object obj);
}


*/

class Person{

}
@FunctionalInterface
interface Addition<T extends Person>{
    T add(T a,T b);
}