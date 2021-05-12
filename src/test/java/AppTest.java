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
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
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
        driver.findElement(By.cssSelector(".skip-account.skip-link > .label")).click();
        driver.findElement(By.cssSelector("a[title='Log In']")).click();
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement emailErrorMessage = driver.findElement(By.id("advice-required-entry-email"));
        Assert.assertEquals("This is a required field.", emailErrorMessage.getText());
        WebElement passwordErroMessage = driver.findElement(By.id("advice-required-entry-pass"));
        Assert.assertEquals("This is a required field.", passwordErroMessage.getText());
    }
    @org.junit.Test
    public void register() {
            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector(".skip-account.skip-link > .label")).click();
            driver.findElement(By.cssSelector("a[title='Register']")).click();
            driver.findElement(By.name("firstname")).sendKeys("Debre");
            driver.findElement(By.id("middlename")).sendKeys("DBR");
            driver.findElement(By.id("lastname")).sendKeys("Andrei");
            driver.findElement(By.id("email_address")).sendKeys("dbrdebredbr@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Zipcode1");
            driver.findElement(By.id("confirmation")).sendKeys("Zipcode1");
            driver.findElement(By.id("is_subscribed")).click();
            driver.findElement(By.cssSelector("button[title='Register'] > span > span")).click();
        WebElement createdText = driver.findElement(By.cssSelector("ul  span"));
        Assert.assertEquals("There is already an account with this email address." +
                " If you are sure that it is your email address," +
                " click here to get your password and access your account.", createdText.getText());
        Assert.assertTrue(createdText.isDisplayed());

        }
        @Test
        public void addToWish() {
            driver.get("http://testfasttrackit.info/selenium-test/");
            driver.findElement(By.cssSelector(".product-info  a[title='Lafayette Convertible Dress']")).click();
            driver.findElement(By.cssSelector(".link-wishlist")).click();
            WebElement succesMsgText = driver.findElement(By.cssSelector("h1"));
            Assert.assertEquals("LOGIN OR CREATE AN ACCOUNT", succesMsgText.getText());
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