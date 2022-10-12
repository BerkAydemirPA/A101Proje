package Deneme;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Deneme_1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement element= driver.findElement(By.xpath("//*[text()='Calculator']"));
        element.click();
        Bekle(2);
        WebElement bosluk1= driver.findElement(By.xpath("//*[@id='number1']"));
        bosluk1.sendKeys("3");
        WebElement bosluk2=driver.findElement(By.xpath("//*[@id='number2']"));
        bosluk2.sendKeys("5");
        Bekle(2);
        WebElement calculate= driver.findElement(By.xpath("//*[@type='submit']"));
        calculate.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("testpages"));
        BekleKapat();
    }
}
