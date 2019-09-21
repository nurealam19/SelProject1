package title;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.openqa.selenium.By;


public class AmazonHome extends CommonAPI {
    @Test
    public void Test1(){
        String title = driver.getTitle();
//      System.out.println(title);

        Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");

        // Testing

    }

}
