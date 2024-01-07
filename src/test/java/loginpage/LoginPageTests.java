package loginpage;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginPageTests extends BaseTests {

    @Test
    public void loginFailed () throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("wrong password");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String expectedMessage = "Your password is invalid!\n" +
                "×";
        String actualMessage = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        System.out.println("Actual message: " + actualMessage);
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void logicSuccessful () throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String expectedMessage = "You logged into a secure area!\n" +
                "×";
        String actualMessage = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        System.out.println("Actual message: " + actualMessage);
        Assertions.assertEquals(expectedMessage, actualMessage);
    }
}
