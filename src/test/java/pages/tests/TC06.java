package pages.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC06 {


    @Test
    public void test06() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.ilkLoginLinki.click();

        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

        hotelMyCampPage.loginButonu.click();

        hotelMyCampPage.hotelManagementLinki.click();

        hotelMyCampPage.HotelRoomListLinki.click();

        WebElement dropDown= hotelMyCampPage.downloadDosyaTuru;
        Select select= new Select(dropDown);
        select.selectByIndex(2);

      hotelMyCampPage.downloadButonu.click();





    }
}
