package concurrent_assignment1.A;

/**
 * Get the reference of the main thread */

public class Reference {
    
public static void main(String[] args) throws InterruptedException {
        Thread h = Thread.currentThread();
        int i;      
        System.out.println(h.getName());
        h.setName("Thread");
        for(i=0;i<100;i++){
            if((i%2)!=0){
            System.out.println(i+" Thread name: "+h.getName());
            h.sleep(2000);
            }
            //else h.sleep(2000);
        }
}
    
    
}
