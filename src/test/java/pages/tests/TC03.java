package pages.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class TC03 {

    @Test
    public void test03() throws InterruptedException {



        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.girisYap();

        hotelMyCampPage.hotelManagementLinki.click();

        hotelMyCampPage.HotelRoomListLinki.click();

        hotelMyCampPage.addHotelRoomLinki.click();

        Assert.assertTrue(hotelMyCampPage.create_HotelRoom_Yazisi.isDisplayed(), "create HotelRoom Yazisi Gözükmedi");

        Thread.sleep(3000);

        Driver.closeDriver();

    }
}
