package threads;

public class Me {

    public static void main(String[] args) {
        FeeFriend feeFriend = new FeeFriend();
        Thread libThread = new Thread(new LibFriend());
        libThread.start();
        feeFriend.start();
        TestSleepMethod1 testSleepMethod1 = new TestSleepMethod1();
        testSleepMethod1.start();
    }
}
