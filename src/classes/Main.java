package classes;

public class Main {

    public static void main(String[] args) {

        Apple apple = new Apple();

        apple.setModelName("iPhone 12");
        apple.setImeiNumber("1111ABC111");
        apple.setVersionNumber("A2172");
        apple.setMemoryCapacity(128000);
        apple.setScreenSize(6.7);
        apple.setKeyboard(new Toucable());

        apple.getInfo();

        System.out.println("\n******************************\n");

        Samsung samsung = new Samsung();

        samsung.setModelName("Galaxy Note20");
        samsung.setImeiNumber("1111ABC111");
        samsung.setVersionNumber("mmWave");
        samsung.setMemoryCapacity(64000);
        samsung.setScreenSize(6.7);
        samsung.setKeyboard(new Keypad());

        samsung.getInfo();

    }
}
