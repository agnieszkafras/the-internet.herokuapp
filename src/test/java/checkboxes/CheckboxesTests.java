package checkboxes;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxesTests extends BaseTests {

    // checkbox 1 - validate is enabled and click
    @Test
    public void checkbox1IsEnabled() throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
        Thread.sleep(1000);

        WebElement checkbox1Enabled = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        boolean isEnabled = checkbox1Enabled.isEnabled();

        if (isEnabled == true) {
            System.out.println("Checkbox 1 is enabled. Clicking on it now.");
            checkbox1Enabled.click();
        }
    }

    // checkbox 1 - validate is selected
    @Test
    public void checkbox1IsSelected() throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
        Thread.sleep(1000);

        WebElement checkbox1Selected = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        boolean isSelected = checkbox1Selected.isSelected();

        if (isSelected == true) {
            System.out.println("Checkbox 1 is selected.");
        } else {
            System.out.println("Checkbox 1 is not selected. Clicking on it now.");
            checkbox1Selected.click();
        }
    }

    // checkbox 2 - validate is displayed and click
    @Test
    public void checkbox2IsDisplayed() throws Exception {

        driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
        Thread.sleep(1000);

        WebElement checkbox2Displayed = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        boolean isDisplayed = checkbox2Displayed.isDisplayed();

        if (isDisplayed == true) {
            System.out.println("Checkbox 2 is displayed. Clicking on it now.");
            checkbox2Displayed.click();
        }
    }
}
