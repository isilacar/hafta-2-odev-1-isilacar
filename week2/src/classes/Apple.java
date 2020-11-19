package classes;

import interfaces.ShareableScreen;
import interfaces.VideoCall;

public class Apple extends Phone implements VideoCall, ShareableScreen {

    @Override
    public void shareScreen() {

        System.out.println(this.getClass().getSimpleName() + " can share screen...");
    }

    @Override
    public void makeVideoCall() {
        System.out.println(this.getClass().getSimpleName() + " can make a video call...");
    }

    @Override
    public void getInfo() {
        super.getInfo();

        this.shareScreen();
        this.makeVideoCall();

    }

}
