package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();

        // klasa anonimowa safari jedna instacja jeden obiekt
        WebDriver safari = new WebDriver() {

            @Override
            public void get() {
                System.out.println("Opening page with Safari");

            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with safari");
            }
        };

        safari.get();
        safari.findElementBy();
    }
}