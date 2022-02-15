package pages.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class TC02 {

    @Test
    public void test02() throws InterruptedException {



        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.girisYap();

        hotelMyCampPage.hotelManagementLinki.click();

        hotelMyCampPage.HotelRoomListLinki.click();

        Assert.assertTrue(hotelMyCampPage.list_of_hotelrooms_yazisi.isDisplayed(),"list of hotelrooms yazisi gözükmedi");

        Thread.sleep(3000);

        Driver.closeDriver();
    }
}