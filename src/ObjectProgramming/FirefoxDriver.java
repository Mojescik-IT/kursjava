package ObjectProgramming;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void findElemendBy() {
        System.out.println("Fin element by Firefox browser");
    }
}
