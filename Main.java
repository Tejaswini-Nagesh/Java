class Main{
    public static void main(String args[]){
        ProducerConsumer pc=new ProducerConsumer();

        Producer p1=new Producer(pc);
        Consumer c1=new Consumer(pc);
        p1.start();
        c1.start();
    }
}