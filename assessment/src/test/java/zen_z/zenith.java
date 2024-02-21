package zen_z;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class zenith {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(){
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/samueladeshinaabatan/Desktop/ZenZ/assessment/src/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.zenithbank.com/");
        driver.manage().window().maximize();

    } 

    @Test
    public void main1(){
        //personal
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.linkText("PERSONAL"));
        action.moveToElement(menu).build().perform();
    }


    


}
