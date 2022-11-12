package elvayundrarindyana;

import elvayundrarindyana.day18.pageobject.drivers.DriverSingleton;
import elvayundrarindyana.day18.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class TestAddToWishlist {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }
}
