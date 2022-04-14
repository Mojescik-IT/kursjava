package drivers;

import drivers.WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void findElementBy() {
        System.out.println("Find element by Firefox browser");
    }
}
