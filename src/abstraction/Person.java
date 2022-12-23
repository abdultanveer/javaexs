package abstraction;

public class Person {

    public static void main(String[] args) {
       SwitchBoardListener sbl;
       //wiring
       sbl = new HavellsAppliances();
               //GEAppliances();
        sbl.switchOne();
        sbl.switchTwo();
        sbl.switchThree();
        sbl.switchFour();
    }
}
