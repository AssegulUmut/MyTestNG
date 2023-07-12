package tests.day15_TestNGReports_data;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluNutellaTesti extends TestBaseRapor {
    public C02_RaporluNutellaTesti() {
    }

    @Test
    public void raporluTest() {
        extentTest = extentReports.createTest("Raporlu Nutella arama", "Kullanici amazonda Nutella arayabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Kullanici amazon anasayfaya gider");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(new CharSequence[]{"Kutella" + Keys.ENTER});
        extentTest.info("Kullanici Nutella icin arama yapar");
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
        extentTest.pass("Sonuclarin Nutella icerdigini test eder");
        Driver.closeDriver();
    }
}
