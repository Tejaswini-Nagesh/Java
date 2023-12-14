abstract class Shape{
    public abstract void draw();
}
class Circle extends Shape{
    
    public void draw(){
        System.out.println("Drawing circle");
    }
}
class Circle2 extends Shape{
    
    public void draw(){
        System.out.println("Drawing circle2.......");
    }
}
class AbstractKeyword{
    public static void main(String s[]){
        Shape s1=new Circle();
        Shape s2=new Circle2();
        s1.draw();
        
    }
}
