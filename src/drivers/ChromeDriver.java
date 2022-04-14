package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void findElementBy() {
        System.out.println("Find element by Chrome browser");
    }
}
