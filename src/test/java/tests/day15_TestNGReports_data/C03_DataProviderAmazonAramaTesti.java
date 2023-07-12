package tests.day15_TestNGReports_data;

import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderAmazonAramaTesti {
    @Test
    public void cokluAramaTesti(){

        //amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //verilen listedeki her bir urun icin ayri ayri
        //arama yapip, sonuclarin o urunu icerdigni test edin
        //Nutella, Cokukrem, Java, Selenium, Apple, Samsunug
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys();
    }
}
