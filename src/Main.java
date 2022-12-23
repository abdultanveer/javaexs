import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        //life b4 lamdas
        DrawableImpl drawable = new DrawableImpl();
        drawable.draw();

        Drawable d1 = () -> {
            System.out.println("lamda is drawing");
        };
        d1.draw();

        Sayable s1 = name -> {       return "welcome mr " + name;       };

        System.out.println(s1.say("abdul"));

        Sayable s2 = DrawableImpl :: saySomething;
        System.out.println(s2.say("ansari"));

        InstanceObj instance = new InstanceObj();
        Sayable s3 = instance::doSomething;

        System.out.println(s3.say(" kotlin"));
    }

}