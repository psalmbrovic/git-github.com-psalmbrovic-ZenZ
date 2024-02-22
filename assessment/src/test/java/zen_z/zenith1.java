package zen_z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;
import scala.concurrent.duration.Duration;

public class zenith1 {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/samueladeshinaabatan/Desktop/ZenZ/assessment/src/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.zenithbank.com/");
        driver.manage().window().maximize();
        // Click the pop up
        driver.findElement(By.id("continue-button")).click();
    }

    @Test
    public void testIndividualCurrentAccount() {
        // Personal
        Actions action = new Actions(driver);

        WebElement menu = driver.findElement(By.linkText("PERSONAL"));
        action.moveToElement(menu).build().perform();

        WebElement submenu = driver.findElement(By.linkText("BANK ACCOUNTS"));
        action.moveToElement(submenu).click().build().perform();

        WebElement menu1 = driver.findElement(By.linkText("PERSONAL"));
        action.moveToElement(menu1).build().perform();

        WebElement submenu1 = driver.findElement(By.linkText("Current Account"));
        action.moveToElement(submenu1).click().build().perform();

        // Validate the  "Individual Current Account"
        if (driver.getPageSource().contains("Individual Current Account")) {
            System.out.println("Individual Current Account is present");
        } else {
            System.out.println("Individual Current Account is not present");
        }
    

        // Validates the Feature and Benefits of the “Individual Current Account”
        driver.findElement(By.id("#features-and-benefits")).click();
        if (driver.getCurrentUrl().contains("https://www.zenithbank.com/personal-banking/bank-accounts/current-account/#features-and-benefits")) {
            System.out.println(driver.getCurrentUrl() + " is present");
        } else {
            System.out.println(driver.getCurrentUrl() + " is not present");
        }

        // Validates the requirements of the “Individual Current Account”
        driver.findElement(By.id("#requirements")).click();
        if (driver.getCurrentUrl().contains("https://www.zenithbank.com/personal-banking/bank-accounts/current-account/#requirements")) {
            System.out.println(driver.getCurrentUrl() + " is present");
        } else {
            System.out.println(driver.getCurrentUrl() + " is not present");
        }

        // Validates the available channels of the “Individual Current Account”.
        driver.findElement(By.id("#available-channels")).click();
        if (driver.getCurrentUrl().contains("https://www.zenithbank.com/personal-banking/bank-accounts/current-account/#available-channels")) {
            System.out.println(driver.getCurrentUrl() + " is present");
        } else {
            System.out.println(driver.getCurrentUrl() + " is not present");
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        zenith1 test = new zenith1();
        test.setUp();
        test.testIndividualCurrentAccount();
        test.tearDown();
    }
}
