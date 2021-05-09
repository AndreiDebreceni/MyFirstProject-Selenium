import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    public void register() {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.name("firstname")).sendKeys("Debre");
        driver.findElement(By.id("middlename")).sendKeys("DBR");
        driver.findElement(By.id("lastname")).sendKeys("Andrei");
        driver.findElement(By.id("email_address")).sendKeys("dbrdebredbr@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Zipcode1");
        driver.findElement(By.id("confirmation")).sendKeys("Zipcode1");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.quit();


    }
}
