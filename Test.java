
 class Demo {
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

 class Test {
    public static void main(String[] args) {
        Demo s1 = new Demo();  // Instantiate Test with Subclass
        s1.sameMethod();
    }
}
