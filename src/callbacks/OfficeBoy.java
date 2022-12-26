package callbacks;

public class OfficeBoy {
    public void doWork(MobilePhone mobilePhone) {
        System.out.println("going to govt office");
        try {
            Thread.sleep(5000);
            System.out.println("done with the govt office work");
            mobilePhone.greenButton();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
