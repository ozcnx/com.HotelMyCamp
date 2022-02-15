package pages.tests;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

import static utilities.ReusableMethods.getScreenshot;

public class TC05<expectedsatirElement> {


    @Test
    public void test05() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.ilkLoginLinki.click();

        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

        hotelMyCampPage.loginButonu.click();

        hotelMyCampPage.hotelManagementLinki.click();

        hotelMyCampPage.HotelRoomListLinki.click();

        hotelMyCampPage.nameListeElement.sendKeys("Zahide");

        hotelMyCampPage.listeSearchButonu.click();


        try {
            getScreenshot("Zahide");
        } catch (IOException e) {
            e.printStackTrace();
        }


        Driver.closeDriver();
    }

}
