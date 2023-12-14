public class Demo {
    public void sameMethod() {
        System.out.println("This is superclass");
    }
}

 class Subclass extends Demo {
    @Override
    public void sameMethod() {
        System.out.println("This is subclass");
    }
}

    public static void main(String[] args) {
        Demo s1 = new Subclass();  // Instantiate Test with Subclass
        s1.sameMethod();
    
}
