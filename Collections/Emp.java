public class EMP{
    private String name;
    private String phone;
    private int empId;
    public EMP(String name,String phone,int empId){
        this.name=name;
        this.phone=phone;
        this.empId=empId;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public int getempId(){
        return empId;
    }
    
}