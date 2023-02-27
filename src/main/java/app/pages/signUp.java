package app.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class signUp {
    private WebDriver driver;
    public signUp(WebDriver driver) {this.driver = driver;}
    private By emailField = By.xpath("//input[@name='astroauth_login']");
    private By passField = By.xpath("//input[@name='astroauth_pass']");
    private By userLoggedIn = By.xpath("//*[contains(text(),'Галина Петрова')]");

    public signUp typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public signUp typePass(String pass) {
        driver.findElement(passField).sendKeys(pass);
        return this;
    }

    public signUp clickConfirm() {
        driver.findElement(By.xpath("//input[@name='astroauth_pass']")).sendKeys(Keys.ENTER);
        return this;
    }
    public boolean isUserLoggedIn() {
        boolean label = isElementPresent(userLoggedIn);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException((e));
        }
        return label;
    }
    public List<WebElement> findAll(By locator) {return driver.findElements(locator);}
    public boolean isElementPresent(By by) {return  findAll(by).size() > 0;}

}
