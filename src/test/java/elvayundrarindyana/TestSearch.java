package elvayundrarindyana;

import elvayundrarindyana.day18.pageobject.drivers.DriverSingleton;
import elvayundrarindyana.day18.pageobject.pages.WebTablesLogin;
import elvayundrarindyana.day18.pageobject.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch {

    public static WebDriver driver;
    private WebTablesLogin login;


    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
        int detik = 1;
      //  JavascriptExecutor js = (JavascriptExecutor) driver;

        delay(detik);
        driver.findElement(By.linkText("Dismiss")).click();
        System.out.println("Dismiss");

        delay(detik);
        driver.get("https://shop.demoqa.com/my-account/");
    }

        @BeforeMethod
    public void pageObject() {
        login = new WebTablesLogin();
    }

    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test
    public void testShopPage() {
        delay(Constants.DETIK);
        // PreCondition
        login.registrationForm("dian", "qwerty0987654321Elva");
        delay(Constants.DETIK);
        // Step
    }

    @Test
    public void testSearchByElva() {
        delay(Constants.DETIK);
        // Step
        //search.searchMenu();
        driver.findElement(By.linkText("Search")).click();
        driver.findElement(By.name("s")).clear();
        driver.findElement(By.name("s")).sendKeys("dress");
        driver.findElement(By.cssSelector(".form-horizontal")).submit();
        driver.findElement(By.xpath("//div[@id='noo-site']/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/a")).click();
        driver.findElement(By.xpath("//div[@id='noo-site']/div[2]/div[2]/div/div/div[3]/div/div/div/div[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='noo-site']/div[2]/div[2]/div/div/div[4]/div/div/div/div[2]/div")).click();
        driver.findElement(By.linkText("My Wishlist")).click();
    }

    static void delay(int detik) {
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }
}
