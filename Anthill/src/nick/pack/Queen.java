package nick.pack;


public class Queen {
    public static Worker[] workers;
    public static Soldier[] soldiers;
    public static void main(String[] args) {
        populate();
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i].sendIntoBattle();
        }
        for (int i = 0; i < workers.length; i++) {
            soldiers[i].sendIntoFood;
        }
        }
    public static void populate(){
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }
        soldiers = new Soldier[70];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = new Soldier();
        }
    }
}
