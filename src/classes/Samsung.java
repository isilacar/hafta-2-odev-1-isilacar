package classes;

import interfaces.Mp3Listener;
import interfaces.ShareableFile;

public class Samsung extends Phone implements ShareableFile, Mp3Listener {

    @Override
    public void listenMP3() {
        System.out.println(this.getClass().getSimpleName() + " can listen MP3...");
    }

    @Override
    public void shareFile() {

        System.out.println(this.getClass().getSimpleName() + " can share a file...");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        this.shareFile();
        this.listenMP3();
    }
}
