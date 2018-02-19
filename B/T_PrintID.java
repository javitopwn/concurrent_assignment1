public class T_PrintID extends Thread {
    int ID;
    public T_PrintID(int x){
        this.ID=x;
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(this.ID);
            }
       
    }
}
}
