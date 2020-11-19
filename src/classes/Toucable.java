package classes;

import interfaces.Keyboard;

public class Toucable implements Keyboard {

    @Override
    public void showKeyboardInfo() {
        System.out.println("Keyboard Info = Touchable keyboard.");
    }
}
