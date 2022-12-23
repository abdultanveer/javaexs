public class DrawableImpl implements  Drawable{
    @Override
    public void draw() {
        System.out.println("i am drawing");
    }

    public static String saySomething(String namez){
        System.out.println("Hello, this is static method.");
        return "hello and welcome mr "+namez;
    }
}