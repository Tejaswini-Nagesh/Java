class ThreadDemo implements Runnable{

    public void run(){
        System.out.println("run method called...");
    }
}
public class RunnableLambdaExpression{

    public static void main(String args[]){
        Thread thread=new Thread(new ThreadDemo());
        thread.start();

        Thread threadLambda=new Thread(()->System.out.println("run method called using lambda"));

        threadLambda.start();
    }
}