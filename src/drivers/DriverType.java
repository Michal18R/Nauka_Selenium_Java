package drivers;

import java.sql.Driver;

public enum DriverType {

    CHROME("chrome", "/src/resources/chromedrive.exe"),
    FIREFOX( "firefox", "/src/resources/firefox.exe");


    String name;
    String path;

    DriverType(String name, String path){
        this.name = name;
        this.path = path;
    }
}
