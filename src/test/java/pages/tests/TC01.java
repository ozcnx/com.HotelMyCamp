package pages.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01 {



    @Test
    public void loginTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

        hotelMyCampPage.ilkLoginLinki.click();

        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

        hotelMyCampPage.loginButonu.click();

        Assert.assertTrue(hotelMyCampPage.list_of_users_yazisi.isDisplayed(), "list_of_users_yazisi gözükmedi");

        Thread.sleep(3000);

        Driver.closeDriver();
    }



}
