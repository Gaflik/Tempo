package app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class registration {
    private WebDriver driver;
    public registration(WebDriver driver) {this.driver = driver;}
    private By regButton = By.xpath("//a[@href='https://www.pizzatempo.by/registration/']");
    private By emailField = By.xpath("//input[@name='email']");
    private By passField = By.xpath("//input[@name='pass']");
    private By repassField = By.xpath("//input[@name='repass']");
    private By fioField = By.xpath("//input[@name='fio']");
    private By phoneField = By.xpath("//input[@name='phone']");
    private By streetField = By.xpath("//input[@name='street']");
    private By houseField = By.xpath("//input[@name='house']");
    private By roomField = By.xpath("//input[@name='room']");
    private By submitButton = By.xpath("//button[@name='form_submit']");
    private By passReg = By.xpath("//*[contains(text(),'Вы успешно зарегистрированы.')]");

    public registration clickReg() {
        driver.findElement(regButton).click();
        return this;
    }

    public registration typeEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public registration typePass(String pass) {
        driver.findElement(passField).sendKeys(pass);
        return this;
    }

    public registration typeRePass(String repass) {
        driver.findElement(repassField).sendKeys(repass);
        return this;
    }

    public registration typeFio(String fio) {
        driver.findElement(fioField).sendKeys(fio);
        return this;
    }

    public registration typePhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public registration typeStreet(String street) {
        driver.findElement(streetField).sendKeys(street);
        return this;
    }

    public registration typeHouse(String house) {
        driver.findElement(houseField).sendKeys(house);
        return this;
    }

    public registration typeRoom(String room) {
        driver.findElement(roomField).sendKeys(room);
        return this;
    }

    public registration clickSubmit() {
        driver.findElement(submitButton).click();
        return this;
    }
    public boolean isPassReg() {
        boolean label = isElementPresent(passReg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }
    public List<WebElement> findAll(By locator) {
        return driver.findElements(locator);
    }
    public boolean isElementPresent(By by) {
        return findAll(by).size() > 0;
    }
}
