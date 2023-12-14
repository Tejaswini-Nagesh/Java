interface Shape{
    void draw();
}



/*class Circle implements Shape{
   // @override
    public void draw(){
        System.out.println("Circle class:draw() method");
    }
}
*/
public class LambdaExpression{
    public static void main(String args[])
    {
        String str="hello";
      /* Shape rectangle=()->System.out.println("Rectangle class: draw() method"); 
       // rectangle.draw();

        Shape square=()->System.out.println("square class method");
       // square.draw();

        Shape circle=()->System.out.println("circle class method");
        //circle.draw();
*/
//functional 
        print(()->System.out.println("Rectangle class: draw() method"));
        print(()->System.out.println("square class method"));
        print(()->System.out.println("circle class method"));
    }
        private static void print(Shape shape){
            shape.draw();
        }
    
}