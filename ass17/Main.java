interface Camera{
    void captureImages();
    void recordVideo();
}

interface WifiEnabled{
    void connectToWifi();
    void disconnectFromWifi();
}

class SmartCamera implements Camera, WifiEnabled {
    public void captureImages() {
        System.out.println("SmartCamera is capturing an image.");
    }

    public void recordVideo() {
        System.out.println("SmartCamera is recording videos.");
    }

    public void connectToWifi() {
        System.out.println("SmartCamera is connected to Wifi.");
    }

    public void disconnectFromWifi() {
        System.out.println("SmartCamera is disconnected from Wifi.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartCamera smartCamera = new SmartCamera();
        System.out.println("----- Camera Functions -----");
        smartCamera.captureImages();
        smartCamera.recordVideo();
        System.out.println("----- Wi-Fi Functions -----");
        smartCamera.connectToWifi();
        smartCamera.disconnectFromWifi();
    }
}