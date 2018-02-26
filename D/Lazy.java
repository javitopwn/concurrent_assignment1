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

public class Lazy extends Thread {
    
    @Override
    public void run(){        
        int ran=(int)(Math.random()*8+2);
        int ran2;        
        for (int i = 0; i < ran && !Thread.currentThread().isInterrupted(); i++) 
        {   
            ran2=(int)(Math.random()*3+1);
            switch(ran2)
                {
                case 1 : System.out.println("I am dressing up...\n"); break;
                case 2 : System.out.println("Just a sec, please...\n");break;
                case 3 : System.out.println("These clothes do not suit me...\n");break;
                } 
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                interrupt();
            }
                               
        }
        
        if(!Thread.currentThread().isInterrupted())System.out.println("I am ready, the early bird catches the worm!\n");
        
        else System.out.println("That’s not cricket, please play the game!\n");
        
    }
}
