package drivers;

public class WebDriversTest {
    public static void main(String[] args) {
        //użycie poliformizmu
        WebDriver driver = getDriver(DriverType.CHROME);
        WebDriver driver2 = getDriver(DriverType.FIREFOX);
        //FirefoxDriver firefox = new FirefoxDriver();

        assert driver != null;
        driver.get();
        driver.findElementBy();
        assert driver2 != null;
        driver2.get();
        driver2.findElementBy();
    }

        private static WebDriver getDriver(DriverType type){
            if(type==DriverType.CHROME){
                return new ChromeDriver();
            } else if (type==DriverType.FIREFOX){
                return new FirefoxDriver();
            }
            return null;
        }
}
