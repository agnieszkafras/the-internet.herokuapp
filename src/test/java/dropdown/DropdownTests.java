package dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropdownTests extends BaseTests {

    @Test
    public void dropdown() throws  Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Dropdown']")).click();
        Thread.sleep(1000);

        // Option 1
        new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]"))).selectByVisibleText("Option 1");

        // Option 2
        new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]"))).selectByIndex(2);
    }
}
