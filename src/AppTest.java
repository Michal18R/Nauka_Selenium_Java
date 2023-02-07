public class AppTest {
    public static void main(String[] args) {
        AndroidApp android = new AndroidApp("Android Koks");
        android.appInfo();
        android.runAndroidApp();

        IphoneApp iphone = new IphoneApp("Iphone Lolz");
        iphone.appInfo();
        iphone.runIphoneApp();
    }
}
