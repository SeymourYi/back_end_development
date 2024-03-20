public class Phone   {
    String name;
    int screenSize;
    int MemoryRam;

    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        MemoryRam = memoryRam;
        this.camera = camera;
    }

    public int getMemoryRam() {
        return MemoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        MemoryRam = memoryRam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    int camera;
    public void playMusic (String trackName) {
        System.out.println("Playing " + trackName);
    }
}
