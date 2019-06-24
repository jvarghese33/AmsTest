package faketest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GenericTestCase {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/AmsTest/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.airmilesshops.ca/en");
    }


    @Test
    public void selectingSignInModal() {
        driver.findElement(By.id("categories-nav-slot_sign-in_nav_slot")).click();

    }

    @Test
    public void selectingSignInButton() {
        driver.findElement(By.id("modal_sign-in")).click();
    }

    @Test
    public void closingSignInModal() {
        driver.findElement(By.id("modal_close")).click();
    }

    @Test
    public void scrollingDownToShopTiles() {
        WebElement element = driver.findElement(By.id("shop-card_amazon_desktop_primary-link_shop-now"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}