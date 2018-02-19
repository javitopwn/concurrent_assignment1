package concurrent_assignment1.A;

/**
 * Get the reference of the main thread */

public class Reference {
       Thread h = Thread.currentThread();

public static void main(String[] args) {
        int i;
        for(i=0;i<100;i++){
            if((i%2)!=0)
            System.out.println(i);
        }
}
    
    
}
