 interface Employee{
    String getName();
}
 /*class SoftwareEngineer implements Employee{
    public String getName()
    {
        return "Software engineer..";
    }
}*/
public class Main1{
    public static void main(String s[]){
        //Employee employee=new SoftwareEngineer();
        Employee employee=()->"software engineer";
       System.out.println(employee.getName());
    };
}
