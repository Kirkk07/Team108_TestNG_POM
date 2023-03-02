package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {
     public QdPage(){

            PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;

     @FindBy(id= "login-email")
    public WebElement emailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath="//button[text()='Login']")
    public WebElement loginButonu;
    @FindBy(xpath="//a[text()='Instructor']")
    public WebElement basariliGirisElementi;
    @FindBy(xpath="//span[text()='Categories']")
    public WebElement categories;
    @FindBy(xpath="//span[text()='IT & Software']")
    public WebElement ITSoftware;
    @FindBy(xpath="//a[text()='Microsoft Certification']")
    public WebElement MicCertification;
    @FindBy(xpath="//label[@for='sub_category-8']")
    public WebElement DisneyEnglish;
    @FindBy(xpath="(//span[@class='current-price'])[2]")
    public WebElement currentPrice;
    @FindBy(xpath = "(//button[@class='btn-compare-sm'])[1] ")
    public WebElement compare;

    @FindBy(xpath = " (//span[@class='select2-selection__placeholder'])[1]")
    public WebElement birincisecimalani;

    @FindBy(xpath = " (//span[@class='select2-selection__placeholder'])[2]")
    public WebElement ikincisecimalani;

    @FindBy(xpath = " /html/body/section[3]/div/div/div/div[5]/div[3]/text()")
    public WebElement seviye;








}
