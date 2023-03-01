package app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class generalPages {

    private WebDriver driver;
    public generalPages(WebDriver driver) {this.driver = driver;}
    private By menuPizza = By.xpath("//a[@href='https://www.pizzatempo.by/menu/pizza.html']");
    private By pagePizza = By.xpath("//*[contains(text(),'Пицца')]");
    private By menuPromotions = By.xpath("//a[@href='https://www.pizzatempo.by/menu/sale.html']");
    private By pagePromotions = By.xpath("//*[contains(text(),'Акции')]");
    private By menuBurgers = By.xpath("//a[@href='https://www.pizzatempo.by/menu/burger.html']");
    private By pageBurgers = By.xpath("//*[contains(text(),'Бургеры, закуски, фри')]");
    private By menuSalads = By.xpath("//a[@href='https://www.pizzatempo.by/menu/salad.html']");
    private By pageSalads = By.xpath("//*[contains(text(),'Салаты, супы, хлеб')]");
    private By menuHotDishes = By.xpath("//a[@href='https://www.pizzatempo.by/menu/goryachee.html']");
    private By pageHotDishes = By.xpath("//*[contains(text(),'Горячие блюда')]");
    private By menuDrinks = By.xpath("//a[@href='https://www.pizzatempo.by/menu/napitki.html']");
    private By pageDrinks = By.xpath("//*[contains(text(),'Напитки')]");
    private By menuBreakfasts = By.xpath("//a[@href='https://www.pizzatempo.by/menu/zavtraki.html']");
    private By pageBreakfasts = By.xpath("//*[contains(text(),'Завтраки c 10.00 до 11.45')]");
    private By menuDesserts = By.xpath("//a[@href='https://www.pizzatempo.by/menu/napitki.html']");
    private By pageDesserts = By.xpath("//*[contains(text(),'Десерты')]");
    private By menuChildMenu = By.xpath("//a[@href='https://www.pizzatempo.by/menu/deti.html']");
    private By pageChildMenu = By.xpath("//*[contains(text(),'Детское меню')]");
    private By menuLunchMenu = By.xpath("//a[@href='https://www.pizzatempo.by/menu/obed.html']");
    private By pageLunchMenu = By.xpath("//*[contains(text(),'Обеденное меню ПН-ПТ с 12.00 до 16.00')]");
    private By menuCutlery = By.xpath("//button[@href='https://www.pizzatempo.by/menu/pribori.html']");
    private By pageCutlery = By.xpath("//*[contains(text(),'Приборы')]");

    public generalPages clickPizza() {
        driver.findElement(menuPizza).click();
        return this;
    }

    public generalPages clickPromo() {
        driver.findElement(menuPromotions).click();
        return this;
    }

    public generalPages clickBurg() {
        driver.findElement(menuBurgers).click();
        return this;
    }

    public generalPages clickSalad() {
        driver.findElement(menuSalads).click();
        return this;
    }

    public generalPages clickHot() {
        driver.findElement(menuHotDishes).click();
        return this;
    }

    public generalPages clickDrink() {
        driver.findElement(menuDrinks).click();
        return this;
    }

    public generalPages clickBreakf() {
        driver.findElement(menuBreakfasts).click();
        return this;
    }

    public generalPages clickDessert() {
        driver.findElement(menuDesserts).click();
        return this;
    }

    public generalPages clickChild() {
        driver.findElement(menuChildMenu).click();
        return this;
    }

    public generalPages clickLunch() {
        driver.findElement(menuLunchMenu).click();
        return this;
    }

    public generalPages clickCutlery() {
        driver.findElement(menuCutlery).click();
        return this;
    }

    public boolean isPagePizza() {
        boolean label = isElementPresent(pagePizza);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPagePromotions() {
        boolean label = isElementPresent(pagePromotions);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageBurgers() {
        boolean label = isElementPresent(pageBurgers);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageSalads() {
        boolean label = isElementPresent(pageSalads);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageHotDishes() {
        boolean label = isElementPresent(pageHotDishes);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageDrinks() {
        boolean label = isElementPresent(pageDrinks);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageBreakfasts() {
        boolean label = isElementPresent(pageBreakfasts);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageDesserts() {
        boolean label = isElementPresent(pageDesserts);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageChildMenu() {
        boolean label = isElementPresent(pageChildMenu);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageLunchMenu() {
        boolean label = isElementPresent(pageLunchMenu);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return label;
    }

    public boolean isPageCutlery() {
        boolean label = isElementPresent(pageCutlery);
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
