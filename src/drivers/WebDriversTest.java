package drivers;

public class WebDriversTest {
    public static void main(String[] args) {
        //użycie poliformizmu
        WebDriver driver = getDriver("chrome");
        WebDriver driver2 = getDriver("firefox");
        //FirefoxDriver firefox = new FirefoxDriver();

        assert driver != null;
        driver.get();
        driver.findElementBy();
        assert driver2 != null;
        driver2.get();
        driver2.findElementBy();
    }

    private static WebDriver getDriver(String name){
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
    }
}
