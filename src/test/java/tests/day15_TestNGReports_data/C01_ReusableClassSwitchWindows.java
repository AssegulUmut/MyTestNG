package tests.day15_TestNGReports_data;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_ReusableClassSwitchWindows {
    public C01_ReusableClassSwitchWindows() {
    }

    @Test
    public void switchWindowTesti() {
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        Driver.getDriver().findElement(By.xpath("//a[text()='Click Here']")).click();
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        Driver.quitDriver();
    }
}
