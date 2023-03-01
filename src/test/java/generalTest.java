import app.appConfig;
import app.pages.generalPages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class generalTest {
    private WebDriver driver;
    private generalPages page;
    private static final Logger log = LogManager.getLogger(generalTest.class);

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Gala\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(appConfig.baseUrl);
        driver.manage().window().maximize();
        log.info("Chrome is started");
    }
    @Test(priority = 0, description = "switch menu scenario.")
    public void generalPages() {
        page = new generalPages(driver);

        page.clickPizza();
        page.clickPromo();
        page.clickBurg();
        page.clickSalad();
        page.clickHot();
        page.clickDrink();
        page.clickBreakf();
        page.clickDessert();
        page.clickChild();
        page.clickLunch();
        page.clickCutlery();
        log.info("User is logged in");
//        Assert.assertTrue(page.isPassReg(),"Wrong page");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
