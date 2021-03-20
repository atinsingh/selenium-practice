import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

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

    @AfterSuite
    public void destroy() throws InterruptedException {
        Thread.sleep(10000);
        webDriver.quit();
    }
}
