import java.util.*;
public class Comparble{
    public static void main(String s[]){
        ArrayList<EMP> emps=new ArrayList<>();
        emps.add(new Emp("neha","123456",12));
        emps.add(new Emp("keya","12456",1));        
        Collections.sort(emps);
        System.out.println(emps);
    }
}