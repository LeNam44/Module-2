package Threading.SimpleThread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator gen1 = new NumberGenerator();
        NumberGenerator gen2 = new NumberGenerator();
        Thread t1 = new Thread(gen1);
        Thread t2 = new Thread(gen2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
