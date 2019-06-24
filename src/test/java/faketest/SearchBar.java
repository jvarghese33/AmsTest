package faketest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.naming.ldap.PagedResultsControl;

public class SearchBar {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/tsd057/IdeaProjects/AmsTest/src/main/resources/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.airmilesshops.ca/en");
    }


    @Test (priority = 1)
    public void selectSearchBarAndType() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input")).sendKeys("Amazon");
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/button")).click();
    }

    @Test (priority = 2)
    public void checkForPlaceHolderText() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input"));

    }

    @Test (priority = 3)
    public void searchBarShowsCategoriesHeader() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input")).sendKeys("e");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement((By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div[2]"))).isDisplayed();
    }

    @Test (priority = 4)
    public void searchBarShowsStoresHeader() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input")).sendKeys("e");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement((By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div[1]"))).isDisplayed();
    }



//
//    @Test (priority = 7)
//    public void hitEnterOnKeyboard() {
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/form/div/input")).sendKeys(Keys.ENTER);
//    }





    @AfterClass
    public void tearDown(){
    //driver.quit();
    }

}