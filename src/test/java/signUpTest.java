import app.appConfig;
import app.pages.signUp;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class signUpTest {
    private WebDriver driver;
    private signUp page;
    private static final Logger log = LogManager.getLogger(signUpTest.class);

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Gala\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(appConfig.baseUrl);
        log.info("Chrome is started");
    }
    @Test (priority = 0, description = "signUp scenrio.")
//    @Step ("Enter email {typeEmail} into field")
    public void signUp() {
        page = new signUp(driver);
        page.typeEmail("gala.po4ta@gmail.com");
        page.typePass("Pass8888");
        page.clickConfirm();
        log.info("User is logged in");
        Assert.assertTrue(page.isUserLoggedIn(),"Wrong page");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
