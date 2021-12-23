package ml.lwj.facade;

public class Stereo {
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return  instance;
    }

    public void on() {
        System.out.println(" Stereo on");
    }

    public void off() {
        System.out.println(" Stereo down");
    }
    public void up() {
        System.out.println(" Stereo up ...");
    }
}
