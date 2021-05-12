import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class AppTest {

    private WebDriver driver;

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @org.junit.Test
    public void loginWithValidCredentials() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("dbrdebredbr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Zipcode1");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement welcomeText = driver.findElement(By.cssSelector(".hello strong"));
        Assert.assertEquals("Hello, Debre DBR Andrei!", welcomeText.getText());
        Assert.assertTrue(welcomeText.isDisplayed());

    }

    @org.junit.Test
    public void loginWithInvalidPassword() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("dbrdebredbr@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Zipcode");
        driver.findElement(By.cssSelector("#send2")).click();
        WebElement errorTextElement = driver.findElement(By.cssSelector(".error-msg span"));
        Assert.assertEquals("Invalid login or password.", errorTextElement.getText());
    }
    @org.junit.Test
    public void loginWithoutMandatoryFields() {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement emailErrorMessage = driver.findElement(By.id("advice-required-entry-email"));
        Assert.assertEquals("This is a required field.", emailErrorMessage.getText());
        WebElement passwordErroMessage = driver.findElement(By.id("advice-required-entry-pass"));
        Assert.assertEquals("This is a required field.", passwordErroMessage.getText());
    }
    @org.junit.Test
    public void register() {
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
        WebElement createdText = driver.findElement(By.cssSelector("ul  span"));
        Assert.assertEquals("There is already an account with this email address." +
                " If you are sure that it is your email address," +
                " click here to get your password and access your account.", createdText.getText());
        Assert.assertTrue(createdText.isDisplayed());

        }
        @Test
        public void addToWish() {
            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > div > h3 > a")).click();
            driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
            WebElement succesMsgText = driver.findElement(By.cssSelector("body > div.wrapper > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li > span"));
            Assert.assertEquals("Lafayette Convertible Dress has been added to your wishlist. Click here to continue shopping.", succesMsgText.getText());
            Assert.assertTrue(succesMsgText.isDisplayed());

        }

    @org.junit.Test
    public void clickSale() throws InterruptedException {
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        Thread.sleep(0);
    }


    @After
    public void close() {
        driver.quit();
    }

}