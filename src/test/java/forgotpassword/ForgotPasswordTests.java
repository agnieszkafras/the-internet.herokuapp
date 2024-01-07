package forgotpassword;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTests extends BaseTests {
    private String email = "test123@test123.com";

    @Test
    public void forgotPassword() throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Forgot Password']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("form_submit")).click();
        Thread.sleep(1000);
    }
}
