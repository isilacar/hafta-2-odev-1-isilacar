package classes;

import interfaces.Keyboard;

public class Keypad implements Keyboard {

    @Override
    public void showKeyboardInfo() {
        System.out.println("Keyboard Info = Keypad keyboard.");
    }
}
