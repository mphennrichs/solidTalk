package _5_DIP.Solution;

import _5_DIP.Violation.Lamp;

public class Button2 {

    //if I need to switch lamp to stereo, I will have to change this
    private IGadget gadget;

    public void press(){
        gadget.doStuffWhenButtonPressed();
    }
}
