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
    R_PrintID o1=new R_PrintID(1);
    R_PrintID o2=new R_PrintID(2);
    R_PrintID o3=new R_PrintID(3);
    R_PrintID o4=new R_PrintID(4);
    R_PrintID o5=new R_PrintID(5);
    o1.run();
    o2.run();
    o3.run();
    o4.run();
    o5.run();
    }
}
