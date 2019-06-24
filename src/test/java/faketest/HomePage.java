package faketest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/AmsTest/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.airmilesshops.ca/en");
    }

    @Test (priority = 1)
    public void termsAndConditions() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[4]/div[2]/div/div/div/div[1]/div[2]/div[2]/a[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Test (priority = 2)
    public void selectingTermsAndConditions() {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[4]/div[2]/div/div/div/div[1]/div[2]/div[2]/a[1]"));
        action.moveToElement(element).perform();
        element.click();
    }

    @Test (priority = 3)
    public void selecingAirMilesWebsite() {
        driver.findElement(By.id("search-nav-slot_airmiles.ca")).click();
        driver.quit();
    }

    @Test (priority = 4)
    public void selectTheHowItWorksButton() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/AmsTest/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.airmilesshops.ca/en");
        driver.findElement(By.id("categories-nav-slot_how-it-works_nav_slot")).click();
    }

    @Test (priority = 5)
    public void goBackHome() {
        driver.findElement(By.id("search-nav-slot_airmiles.ca")).click();

    }

    @Test (priority = 6)
    public void selectingTheStoreInfo(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"shop-card_apple_desktop_secondary-link_store-info\"]/div[2]/div[1]/div"));
        driver.findElement(By.id("shop-card_apple_desktop_secondary-link_store-info")).click();
    }



//    @Test (priority = 5)
//    public void selectTheLogoToGoHome(){
//        driver.findElement(By.id("3wabow1q6kayA6WUIUqya2_NavSearchBarLogoLink")).click();
//
//    }
//
//    @Test (priority = 6)
//    public void selectSearchBar() {
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input")).sendKeys("Amazon");
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/button")).click();
//    }
////
//    @Test (priority = 7)
//    public void hitEnterOnKeyboard() {
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input")).sendKeys(Keys.ENTER);
//    }





    @AfterClass
    public void tearDown(){

    }
//    driver.quit()
}