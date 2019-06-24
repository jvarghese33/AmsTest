package faketest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInModal {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/AmsTest/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.airmilesshops.ca/en");
    }
    @Test(priority = 1 )
    public void selectingSignInModal() {
        driver.findElement(By.id("categories-nav-slot_sign-in_nav_slot")).click();

    }
    @Test(priority = 2)
    public void typingTheIncorrectPassword() {
        driver.findElement(By.id("modal_collector-number-input")).sendKeys("123456");

    }
    @Test(priority = 3)
    public void selectingEnterAfterIncorrectPasswordWithTheEnterKey() {
        WebElement textbox = driver.findElement(By.id("modal_sign-in"));
        textbox.sendKeys(Keys.RETURN);
    }

    @Test(priority = 4)
    public void selectingOverlayDismissesPopup(){
        driver.findElement(By.xpath("/html/body/div[4]/div")).click();

    }
//    @Test(priority = 5)
//    public void selectingForgotPassword() {
////        try {
////            Thread.sleep(5000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//        driver.findElement(By.id("modal_i-forgot-my-number")).click();


    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}

