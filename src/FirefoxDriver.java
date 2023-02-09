public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą Firefoxa");
    }

    @Override
    public void findElementBy() {
        System.out.println("Szukanie elementu za pomocą Firefoxa");
    }
}
