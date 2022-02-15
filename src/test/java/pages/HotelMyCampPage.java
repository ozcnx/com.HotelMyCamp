package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;



public class HotelMyCampPage {

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement list_of_users_yazisi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']")
    public WebElement HotelRoomListLinki;

    @FindBy(xpath = "(//*[text()='List Of Hotelrooms'])[2]")
    public WebElement list_of_hotelrooms_yazisi;

    @FindBy(xpath = "//*[text()='Add Hotelroom ']")
    public WebElement addHotelRoomLinki;

    @FindBy(xpath = "//*[@class='caption']")
    public WebElement create_HotelRoom_Yazisi;

    @FindBy(xpath = "//*[@name='Code']")
    public WebElement listeCodeKutucugu;

    @FindBy(xpath = "//*[@id='Price']")
    public WebElement priceKutucugu;

    @FindBy(xpath = "//*[@name='IDGroupRoomType']")
    public WebElement roomTypeKutucugu;

    @FindBy(xpath = "(//*[@class='label label-success'])[4]")
    public WebElement price500;

    @FindBy(xpath = "//*[@id='IsAvailable']")
    public WebElement approvedElement;

    @FindBy(id = "btnSubmit")
   public WebElement saveButton;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement okButton;

    @FindBy(xpath = "//*[@class='icon-arrow-up']")
    public WebElement yukariOkButton;

    @FindBy(xpath = "(//*[@class='modal-body'])[2]")
    public WebElement odaEklendiYazisi;

    @FindBy(xpath = "(//*[@class='form-control form-filter input-sm'])[4]")
    public WebElement nameListeElement;


    @FindBy(xpath = "//*[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement listeSearchButonu;

    @FindBy (xpath = "//*[@id='itemsExportTypes']")
    public WebElement downloadDosyaTuru;

    @FindBy(xpath = "//*[@class='fa fa-download']")
    public WebElement downloadButonu;

    @FindBy(xpath = "//*[@id='IDHotel']")
    public WebElement selectHotelIdKutucugu;

    @FindBy(xpath = "//*[@id='IDGroupRoomType']")
    public WebElement selectRoomTypeKutucugu;





    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
    }


}
