import java.util.*;
/*public class SecondProgram{
    public static void main(String s[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println(name);
    }
}*/
public class SecondProgram{
/*public static void main(String s[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=a+b;
    System.out.println(c);
}*/
/*public static void main(String s[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>19)
    {
        System.out.println("age is greater");
    }
    else{
        System.out.println("age is not greater");
    }
}*/
//=====================
public static void main(String s[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your fav color");
    String name=sc.next();
    switch(name){
        case "blue":
        System.out.println("this is blue");
        break;
        case "red":
        System.out.println("this is red");
        break;
        default:
        System.out.println("white");
    };
}
}