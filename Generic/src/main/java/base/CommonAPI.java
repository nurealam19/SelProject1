package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})


    @BeforeMethod

    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nurea\\AnywebApplication\\Generic\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        //driver.navigate().
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    @Test
    public void Test1(){
       String title = driver.getTitle();
       System.out.println(title);
       Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

    }
//    public void clickOnElement(String locator){
//        try {
//            driver.findElement(By.cssSelector(locator)).click();
//        }catch (Exception ex){
//            try {
//                driver.findElement(By.className(locator)).click();
//            }catch (Exception ex2) {
//                try {
//                    driver.findElement(By.id(locator)).click();
//                } catch (Exception ex3) {
//                    driver.findElement(By.xpath(locator)).click();
//                }
//            }
//        }
//    }
//    public void typeOnElement(String locator, String value){
//        try {
//            driver.findElement(By.cssSelector(locator)).sendKeys(value);
//        }catch (Exception ex){
//            driver.findElement(By.id(locator)).sendKeys(value);
//        }
//    }




}
