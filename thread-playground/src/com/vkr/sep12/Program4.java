package com.vkr.sep12;

class Data {
    private String packet;
    
    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;
 
    public synchronized void send(String packet) {
        while (!transfer) {
            try { 
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
            }
        }
        transfer = false;
        
        this.packet = packet;
        notify();
    }
 
    public synchronized String receive() {
        while (transfer) {
            try {
                wait();
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
            }
        }
        transfer = true;
 
        notify();
        return packet;
    }
}

class Sender implements Runnable {
    private Data data;
 
    // standard constructors
    
    Sender(Data load){
    	this.data = load;
    }
 
    public void run() {
        String packets[] = {
          "First packet",
          "Second packet",
          "Third packet",
          "Fourth packet",
          "End"
        };
 
        for (String packet : packets) {
        	System.out.println(Thread.currentThread().getName() + " sends data - " + packet);
            data.send(packet);
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)  {
                Thread.currentThread().interrupt(); 
           }
        }
    }
}


class Receiver implements Runnable {
    private Data load;
 
    // standard constructors
    Receiver(Data load){
    	this.load = load;
    }
 
    public void run() {
        for(String receivedMessage = load.receive();
          !"End".equals(receivedMessage);
          receivedMessage = load.receive()) {
            
        	System.out.println(Thread.currentThread().getName() + " receives data - " + receivedMessage);
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
        }
    }
}



public class Program4 {

	public static void main(String[] args) {
		Data data = new Data();
	    Thread sender = new Thread(new Sender(data));
	    Thread receiver = new Thread(new Receiver(data));
	    
	    sender.start();
	    receiver.start();

	}

}
