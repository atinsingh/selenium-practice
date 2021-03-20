import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HomeTest {
    private WebDriver webDriver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/drivers/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("https://zoom.us");
    }

    @Test(enabled = false)
    public void tc() throws InterruptedException {
        WebDriver.Window window = webDriver.manage().window();
         //window.fullscreen();
        //Thread.sleep(10000);
        //window.maximize();
        Dimension size = window.getSize();
        System.out.println(size.height);
        System.out.println(size.width);
        Thread.sleep(5000);
        Dimension newSize = new Dimension(375,812);
        webDriver.manage().window().setSize(newSize);
        webDriver.manage().window().setPosition(new Point(200,200));

    }

    @Test
    public void tc3() throws InterruptedException {

        webDriver.findElement(By.linkText("SIGN IN")).click();
        WebElement el = webDriver.findElement(By.id("signupfree"));
        //el.click();
       // WebElement link = el.findElement(By.tagName("a"));
//        WebElement form = webDriver.findElement(By.id("login-form"));
//        form.submit();

//        WebElement element = webDriver.findElement(By.id("header_container"));
//        element.click();

        System.out.println(el.getSize().width);
        System.out.println(el.getSize().height);
        WebElement email = webDriver.findElement(By.id("email"));
        email.sendKeys("learning@learning.com");
        //Thread.sleep(5000);

        email.clear();

        System.out.println(el.getLocation().x);
        System.out.println(el.getLocation().y);

        System.out.println(el.getAttribute("class"));
        System.out.println(el.getTagName());
        System.out.println(el.getCssValue("background-color"));
        System.out.println(el.isDisplayed());

        WebElement element = webDriver.findElement(By.xpath("//div[@id='signupfree']/a"));

        System.out.println(element.getCssValue("background-color"));
        //((JavascriptExecutor) webDriver).executeScript("arguments[0].style.display='none'", element);
        //((JavascriptExecutor) webDriver).executeScript("arguments[0].disabled=true", element);
        Thread.sleep(200);

        System.out.println(element.isDisplayed());
        System.out.println(element.isEnabled());

        System.out.println(element.getAttribute("data-on-event"));
        System.out.println(element.getRect().x);
        System.out.println(element.getRect().y);

        System.out.println(element.getSize().width);
        System.out.println(element.getSize().height);

        System.out.println(element.getText());

        File file = element.getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(file.toPath(), Paths.get("screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    @AfterSuite
    public void destroy() throws InterruptedException {
        Thread.sleep(10000);
        webDriver.quit();
    }
}
