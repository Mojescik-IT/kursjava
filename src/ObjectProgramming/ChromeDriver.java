package ObjectProgramming;

public class ChromeDriver implements  WebDriver{
    @Override
    public void get() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void findElemendBy() {
        System.out.println("Find element by Chrome browser");
    }
}
