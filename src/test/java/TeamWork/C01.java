package TeamWork;

import com.beust.ah.A;
import net.bytebuddy.build.Plugin;
import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

import static utilities.Driver.closeDriver;
import static utilities.Driver.driver;

public class C01 {
    QdPage qdPage=new QdPage();
    @Test(priority = 1)
    public void LoginTesti() throws IOException {

    //  https://www.qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

    // dogru  kullanici adi ve sifresi ile  giris yapin giris yapildigini test eden ve fotograf cekin

        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonu.click();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
        softAssert.assertAll();
       // Driver.closeDriver();
       //Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
        TakesScreenshot ts= (TakesScreenshot) Driver.getDriver(); // interfacelerden obje olusturulmaz casting yapmaliyiz.

        File logincheck=new File("target/screenchotlogin.png"); // yolgosterip uzantisini yazmaliyiz.
        File geciciResim=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,logincheck); // exception firlatmamiz istrer.


    // Categories bolumunde bulunan -->IT-Software-->Microsoft Certification bolumlerini secin



    // Categories bolumdeki basliklar dan  DISNEY MAGIC ENGLISH bulumunu secip DISNEY MAGIC ENGLISH kursunun
    // ucretinin $400 dan daha yuksek oldugunu test edin ve ekran goruntusunu alin

    // son olarak compera bolumune tiklayarak acilan ekranda birinci secim alanina Java Kursu ikinci secim alanina da Piano
    // ekran goruntusunu alin
    // Java Kursunun egitim seviyesinin Intermediate oldugunu test edin.
    }

    @Test(priority = 2)
    public void Catagories() throws IOException, InterruptedException {
        qdPage=new QdPage();
        // Categories bolumunde bulunan -->IT-Software-->Microsoft Certification bolumlerini secin
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qdPage.categories).perform();
        actions.moveToElement(qdPage.ITSoftware).perform();
        qdPage.MicCertification.click();
        qdPage.DisneyEnglish.click();
        String Ap=qdPage.currentPrice.getText().replaceAll("\\D","");
        System.out.println(Ap);
       int actualPrice=Integer.parseInt(Ap);




        int expectedPrice=400;
        TakesScreenshot tsS= (TakesScreenshot) Driver.getDriver();

        File PriceSs=new File("target/PriceSs.png");
        File geciciData=tsS.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciData,PriceSs);
        Thread.sleep(2000);
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(expectedPrice<actualPrice, "Fiyat 400 eurondan dusuk" );
        softAssert.assertAll();
        Driver.closeDriver();

        // Categories bolumdeki basliklar dan  DISNEY MAGIC ENGLISH bulumunu secip DISNEY MAGIC ENGLISH kursunun
        // ucretinin $400 dan daha yuksek oldugunu test edin ve ekran goruntusunu alin
    }
    @Test(priority = 3)
    public void compareTest() throws IOException {
        qdPage=new QdPage();
        // son olarak compera bolumune tiklayarak acilan ekranda birinci secim alanina Java Kursu ikinci secim alanina da Piano
        qdPage.compare.click();
        qdPage.birincisecimalani.sendKeys("Java Kursu");
        qdPage.ikincisecimalani.sendKeys("Piano");
        // ekran goruntusunu alin
        TakesScreenshot tSs= (TakesScreenshot) Driver.getDriver();
        File ucuncuEkrenG=new File("target/ucuncuEkrenG.jpeg");
        File geciciData=tSs.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciData,ucuncuEkrenG);
        // Java Kursunun egitim seviyesinin Intermediate oldugunu test edin.
        SoftAssert softAssert=new SoftAssert();
        String actualSeviye=qdPage.seviye.getText();
        String expectedSeviye="Intermediate";
        softAssert.assertEquals(actualSeviye,expectedSeviye,"beklenen seviye karsilanamamistir.");
        softAssert.assertAll();

    }

}
