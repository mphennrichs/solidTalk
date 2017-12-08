package _5_DIP.Violation;

public class Button {

    //if I need to switch lamp to stereo, I will have to change this
    private Lamp lamp = new Lamp();

    public void press(){
        lamp.doStuffWhenButtonPressed();
    }
}
