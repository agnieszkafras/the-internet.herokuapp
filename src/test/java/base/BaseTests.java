package base;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    protected static WebDriver driver;

    @BeforeEach
    public void getDriver () {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aga\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

//    @AfterEach
//    public  void tearDown() {
//        driver.quit();
//    }
}
