package abstraction;

public class GEAppliances implements SwitchBoardListener{
    @Override
    public void switchOne() {
        System.out.println("ge light is on");
    }

    @Override
    public void switchTwo() {
        System.out.println("ge fan is on");

    }

    @Override
    public void switchThree() {
        System.out.println("ge ac is on");
    }

    @Override
    public void switchFour() {
        System.out.println("ge motor is on");
    }
}
