package concurrent_assignment1.C;

/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author yournamehere
 *
 */

public class Numbers {
    
    public static void main(String[] args) {
    
        Thread o1 = new Thread(new R_PrintID(1));
        Thread o2 = new Thread(new R_PrintID(2));
        Thread o3 = new Thread(new R_PrintID(3));
        Thread o4 = new Thread(new R_PrintID(4));
        Thread o5 = new Thread(new R_PrintID(5));
        
    o1.start();
    o2.start();
    o3.start();
    o4.start();
    o5.start();
    }
}
