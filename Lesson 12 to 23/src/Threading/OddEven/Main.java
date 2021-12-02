package Threading.OddEven;

public class Main {
    public static void main(String[] args) {
        OddThread o = new OddThread();
        EvenThread e = new EvenThread();

        o.start();

        try {
            o.join();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        e.start();

    }
}
