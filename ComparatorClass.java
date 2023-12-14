public class ComparatorClass{
    int x=10;
}
private void doSomething(){
    Employee1 employee1=()=>{
        System.out.println(this.x);
        return "100";
    }
}
Employee1 employee1=new Employee1(){
    int x=10;
    @Override
    public String getSalary(){
        System.out.println(this.x);
        return "100";
    }
}