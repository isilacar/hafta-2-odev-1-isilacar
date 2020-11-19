package classes;

import interfaces.Keyboard;

public class Phone {
    private String modelName;
    private String imeiNumber;
    private String versionNumber;
    private int memoryCapacity;
    private double screenSize;
    private Keyboard keyboard;


    public String getModelName() {

        return modelName;
    }

    public void setModelName(String modelName) {

        this.modelName = modelName;
    }

    public String getImeiNumber() {

        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {

        this.imeiNumber = imeiNumber;
    }

    public String getVersionNumber() {

        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {

        this.versionNumber = versionNumber;
    }

    public int getMemoryCapacity() {

        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {

        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenSize() {

        return screenSize;
    }

    public void setScreenSize(double screenSize) {

        this.screenSize = screenSize;
    }

    public Keyboard getKeyboard() {

        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {

        this.keyboard = keyboard;
    }

    public void calling() {
        System.out.println(this.getClass().getSimpleName() + " can make a call...");
    }

    public void sendingSMS() {
        System.out.println(this.getClass().getSimpleName() + " can send a SMS...");
    }


    public void getInfo() {
        String s = "Model Name = " + this.getModelName()
                + "\nIMEI Number = " + this.getImeiNumber()
                + "\nVersion Number = " + this.getVersionNumber()
                + "\nMemory Capacity = " + this.getMemoryCapacity() + "MB"
                + "\nScreen Size = " + this.getScreenSize() + "INC";
        System.out.println(s);
        this.getKeyboard().showKeyboardInfo();
        this.calling();
        this.sendingSMS();

    }

}
