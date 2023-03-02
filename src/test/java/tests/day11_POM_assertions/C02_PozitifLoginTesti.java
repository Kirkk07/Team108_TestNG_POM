package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PozitifLoginTesti {
    @Test
    public void pozitifLoginTesti(){
        //QD git
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //login linkine tikla
        QdPage qdPage=new QdPage();
        qdPage.ilkLoginLinki.click();
        //gecerli kullanici adi ve password getir

        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUserName"));
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonu.click();
        //basarili bir sekilde giris yapildi test edin.
        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

    }
}
