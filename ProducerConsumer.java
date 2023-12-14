class ProducerConsumer{
    int n;
    boolean f=false;
   synchronized public void produce_item(int n) throws Exception{
       if(f){
           try{
           //false chance of producer
           //true chance of consumer
           wait();
           }catch(Exception e)
           {

           }
       }
        this.n=n;

        System.out.println("Produced:" +this.n);
        f=true;
        notify();
    }
    synchronized public int consume_item()throws Exception{
        if(!f)
        {
            wait();
        }
        System.out.println("Consumed:" +this.n);
        f=false;
		notify();
        return this.n;
    }

}