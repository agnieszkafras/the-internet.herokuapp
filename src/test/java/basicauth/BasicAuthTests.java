package basicauth;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class BasicAuthTests extends BaseTests {
    private String username = "admin";
    private String password = "admin";
    private String urlAuth = "https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";

    @Test
    public void basicAuth() throws Exception {
        driver.findElement(By.xpath("//a[normalize-space()='Basic Auth']")).click();
        Thread.sleep(1000);
        driver.navigate().to(urlAuth);
        Thread.sleep(1000);

        String expectedMessage = "Congratulations! You must have the proper credentials.";
        String actualMessage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
        System.out.println("Actual message: " + actualMessage);
        Assertions.assertTrue(actualMessage.equalsIgnoreCase("Congratulations! You must have the proper credentials."), "Your credentials are invalid.");
    }
}
