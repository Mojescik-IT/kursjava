package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver =  getDriver("firefoxxx");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

        System.out.println("---------------------");



    }

    public static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name!");
    }
}
