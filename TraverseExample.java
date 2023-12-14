import java.util.*;
import java.util.function.Consumer;
public class TraverseExample{

    public static void main(String args[])
    {
        ArrayList<String> names=new ArrayList<String>();
        names.add("john");
        names.add("jemmy");
        names.add("Roshni");
        names.add("vandana");
        names.add("vandana");


        for(String str:names){
            System.out.println(str+"\t"+str.length());
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }


        System.out.println(names.get(0));
        System.out.println(names);
        System.out.println("============================");

        
 //traversing using ITERATOR: Forward traversing
        Iterator<String> itr = names.iterator();

        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }


        HashSet<Double> nms=new HashSet<Double>();
        nms.add(14.20);
        nms.add(34.1234);
        nms.add((2354.234));
        nms.add(99.3);
        nms.add(99.3);

        System.out.println(nms);

        TreeSet<Double> tset=new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

        //backward traversal of collection Listiterator
           ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }

    }
}