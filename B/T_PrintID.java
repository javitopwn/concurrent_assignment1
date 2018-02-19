public class T_PrintID extends Thread implements Runnable {
    int ID;
    public T_PrintID(int x){
        this.ID=x;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.ID);
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
       
    }
}
}
