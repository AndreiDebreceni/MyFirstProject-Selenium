import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToWishList {

    public void addToWish() {
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > div > h3 > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.quit();

    }
}
