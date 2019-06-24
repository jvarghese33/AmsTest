package faketest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectTiles {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/AmsTest/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.airmilesshops.ca/en");

    }

    @Test
    public void scrollingDownToShopTiles() {
        WebElement element = driver.findElement(By.id("shop-card_amazon_desktop_primary-link_shop-now"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test
    public void hoveringOverTile() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.id("shop-card_amazon_desktop_primary-link_shop-now"));
        action.moveToElement(element).perform();
    }

    @Test
    public void selectShopNow(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.id("shop-card_amazon_desktop_primary-link_shop-now"));
        action.moveToElement(element).perform();
        driver.findElement(By.id("shop-card_amazon_desktop_primary-link_shop-now")).click();
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}