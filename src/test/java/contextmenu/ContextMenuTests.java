package contextmenu;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuTests extends BaseTests {

    @Test
    public void contextMenu() throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Context Menu']")).click();
        Thread.sleep(1000);

        // Right-click in the box
        WebElement element = driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions action= new Actions(driver);
        action.contextClick(element).build().perform();

        // Get text from the alert and accept the alert
        Alert alert=driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println("Alert message: " + alertMessage);
        Assertions.assertEquals(alertMessage, "You selected a context menu");
        alert.accept();
    }
}
