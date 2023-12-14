import java.util.*;
public class StringPrograms{
   /* Substring program
   public static void main(String s[]){
        String sentence="my name is Tony";
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);
    }*/

    //using stringbuilder we can modifies string
    public static void main(String s[]){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(3));

        //set char at index 0 // replace char
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //insert char and shift string
        sb.insert(2,'G');
        System.out.println(sb);
        //delete the extra 'n'
        sb.delete(2,3);
        System.out.println(sb);
    }
}