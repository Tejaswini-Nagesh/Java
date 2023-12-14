import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection{
    public static void main(String s[]){
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(14);
        list.add(10);
        list.add(12);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
    }
}

