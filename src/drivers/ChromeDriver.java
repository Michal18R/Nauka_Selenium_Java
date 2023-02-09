package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą Chroma");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą Chroma");
    }
}
