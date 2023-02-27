import app.appConfig;
import app.pages.registration;
import app.pages.signUp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class regTest {
    private WebDriver driver;
    private registration page;
    private static final Logger log = LogManager.getLogger(signUpTest.class);

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Gala\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(appConfig.baseUrl);
        log.info("Chrome is started");
    }
    @Test(priority = 0, description = "signUp scenrio.")
//    @Step ("Enter email {typeEmail} into field")
    public void signUp() {
        page = new registration(driver);
        page.clickReg();
        page.typeEmail("edeed@gmail.com");
        page.typePass("Pass8888");
        page.typeRePass("Pass8888");
        page.typePhone("375299658963");
        page.typeFio("ghgjg");
        page.typeStreet("kfkfk");
        page.typeHouse("ee");
        page.typeRoom("rr");
        page.clickSubmit();
        log.info("User is logged in");
        Assert.assertTrue(page.isPassReg(),"Wrong page");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

