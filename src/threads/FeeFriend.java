package threads;

public class FeeFriend extends  Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("getting signature from fee dept");
    }
}
