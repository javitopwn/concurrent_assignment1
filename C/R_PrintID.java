package concurrent_assignment1.C;
/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author yournamehere
 *
 */
import java.util.logging.Level;
import java.util.logging.Logger;

public class R_PrintID implements Runnable{
    int ID;
    public R_PrintID(int x){
        this.ID=x;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.ID);
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(R_PrintID.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}



