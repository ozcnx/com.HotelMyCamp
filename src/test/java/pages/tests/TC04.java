package pages.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

import static utilities.ReusableMethods.getScreenshot;


public class TC04 {

    @Test
    public void test04() throws InterruptedException {

            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

            HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

            hotelMyCampPage.ilkLoginLinki.click();

            hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

            hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));

            hotelMyCampPage.loginButonu.click();

            hotelMyCampPage.hotelManagementLinki.click();

            hotelMyCampPage.HotelRoomListLinki.click();

            hotelMyCampPage.addHotelRoomLinki.click();

            //================================================

        WebElement dropdownElementi=hotelMyCampPage.selectHotelIdKutucugu;
        Select select=new Select(dropdownElementi);
        select.selectByVisibleText("Test1002 Hotel");


        WebElement codeKutucugu=hotelMyCampPage.listeCodeKutucugu;
        Actions actions=new Actions(Driver.getDriver());

        actions.click(codeKutucugu).
                sendKeys("10000").sendKeys(Keys.TAB).
                sendKeys("Zahide").sendKeys(Keys.TAB).
                sendKeys("Alanya").sendKeys(Keys.PAGE_DOWN).
                perform();

        Thread.sleep(1500);


        WebElement dropElement=hotelMyCampPage.price500;
        WebElement dragElement=hotelMyCampPage.priceKutucugu;


        actions.dragAndDrop(dropElement,dragElement).perform();

        actions.click(dragElement).sendKeys(Keys.PAGE_DOWN).perform();


        WebElement roomTypeDropdownElementi=hotelMyCampPage.roomTypeKutucugu;
        select=new Select(roomTypeDropdownElementi);
        select.selectByIndex(2);

        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).
                perform();
        actions.click(hotelMyCampPage.approvedElement).perform();

        hotelMyCampPage.saveButton.click();
        Thread.sleep(1500);
        //String actualSonucYazisi=hotelMyCampPage.odaEklendiYazisi.getText();
        //String expectedSonucYazisi="HotelRoom was inserted successfully";




        try {
            getScreenshot("HotelRoom was inserted successfully Yazisi");
        } catch (IOException e) {
            e.printStackTrace();
        }



        hotelMyCampPage.okButton.click();

        hotelMyCampPage.yukariOkButton.click();

        Assert.assertTrue(hotelMyCampPage.create_HotelRoom_Yazisi.isDisplayed());

        Driver.closeDriver();





    }
}
