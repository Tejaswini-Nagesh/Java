import java.util.*;
public class MapExample{
    public static void main(String args[]){

        HashMap<String,Integer> courses=new HashMap<>();

        //adding elements
        courses.put("core java",4000);
        courses.put("Basic python",3500);
        courses.put("Spring",8000);
        courses.put("Android",4000);
        courses.put("Android",5000);

        courses.forEach((e1,e2)->{
            System.out.println(e1+ "=>"+e2);
        });

        System.out.println(courses.get("core java"));

        System.out.println(courses);
    }
}