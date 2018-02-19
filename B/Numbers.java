package concurrent_assignment1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5) and runs them.
 * Can you detect some problem? Can you explain the reason?
 * 
 * @author yournamehere
 *
 */

public class Numbers {
    
    public static void main(String[] args) {
    T_PrintID o1=new T_PrintID(1);
    T_PrintID o2=new T_PrintID(2);
    T_PrintID o3=new T_PrintID(3);
    T_PrintID o4=new T_PrintID(4);
    T_PrintID o5=new T_PrintID(5);
    o1.run();
    o2.run();
    o3.run();
    o4.run();
    o5.run();
    }
}
