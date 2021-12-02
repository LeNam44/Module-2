package Threading.SimpleThread;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Generator start with hash code " + hashCode());
            for (int i = 0; i < 10 ; i++) {
                System.out.println("Printing " + i + " with hash code " + hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted!!!");
        }

    }
}
