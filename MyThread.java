class MyThread implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++)
        {
            System.out.println("value of i is"+i);
            try{
            Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
    public static void main(String args[]){
        MyThread t1=new MyThread();

        Thread th=new Thread(t1);
        //object of another thread
        MyAnotherThread t2=new MyAnotherThread();

        th.start();
        t2.start();
    }
}