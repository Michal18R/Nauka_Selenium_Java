package drivers;

public class WebDriversTest {
    public static void main(String[] args) {
        //użycie poliformizmu
        DriverType[] driverTypes = DriverType.values();
        for (int i=0; i< driverTypes.length; i++){
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }


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
            if(type.name.equals("chrome")){
                System.out.println(type.path);
                return new ChromeDriver();

            } else if (type.name.equals("firefox")){
                System.out.println(type.path);
                return new FirefoxDriver();
            }
            return null;
        }
}
