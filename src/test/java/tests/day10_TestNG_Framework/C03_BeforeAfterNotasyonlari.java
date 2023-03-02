package tests.day10_TestNG_Framework;


    /*
    Test Cesitleri;
    === uniqe test bizimle ilgil degil developerlar yapiyor.===
    Smoke test
    Regression Test==(Butun Testlerin calismasidir. 20.bin testi ayni anda calistirmak istemeuebiliriz. mini regression testleri yapariz.
    EndToEmd E2E
    Test Suite : Birden Fazla Testin bir amac icin biraaraya getirilmesidir.
    Test: bir amac icin bir araya getirilmis test methodlari, class'lari veya
        /ve packagelari icerir.
     Test hiyerarsisi:
     -Suit
     -test
     -groups,packages,classes,methods
         Ornek Hiyerarsi:
        Before Suite
        Before Test
        before Class
        Before Method
        Test01
        After Method
        After Class
        after Test
     */
import org.testng.annotations.*;

public class C03_BeforeAfterNotasyonlari {
    /*
        Smoke Test
        Regression Test
        EndToEnd (E2E)
        Test Suite : Birden fazla Test'in bir amac icin biraraya getirilmesidir
        Test : Bir amac icin bir araya getirilmis test method'lari, class'lari
               ve/veya package'lari icerir
        Test Hiyerarsisi :
            - Suite
            - Test
            - groups, packages, classes, methods
     */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @Test
    public void test01(){
        System.out.println("test1");
    }
    @Test
    public void test02(){
        System.out.println("test2");
    }
    @Test
    public void test03(){
        System.out.println("test3");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterClass(groups="smoke")
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }


}
