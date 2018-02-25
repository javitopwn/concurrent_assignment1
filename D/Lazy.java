package concurrent_assignment1.D;

/** Lazy must:
 * - Extend Thread
 * - Enter in a loop which iterates a random number of times between 2 to 8.
 * - Sleep 1 second
 * - At each iteration, it displays a random message among: “I am dressing up…”, “Just a sec, please…”, or “These clothes do not suit me…”.
 * - If Hurry interrupts Lazy before it is finished, Lazy claims: “That’s not cricket, please play the game!”.
 * - If Lazy finishes before being interrupted, it says “I am ready, the early bird catches the worm!”.
 * 
 * @author Viktitors
 *
 */

public class Lazy extends Thread implements Runnable{
    
    @Override
    public void run(){        
        int ran=(int)(Math.random()*8+2);
        int ran2=(int)(Math.random()*2);
        
        for (int i = 0; i < ran; i++) 
        {   
            if(this.isInterrupted())System.out.println("That’s not cricket, please play the game!\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(Lazy.class.getName()).log(Level.SEVERE, null, ex);
            }
                switch(ran2)
                {
                case 0 : System.out.println("I am dressing up...\n");
                case 1 : System.out.println("Just a sec, please...\n");
                case 2 : System.out.println("These clothes do not suit me...\n");
                }                
        }
        if(!this.isInterrupted())System.out.println("I am ready, the early bird catches the worm!\n");
    }
}
