package Test;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;


public class buscarCancion{
	
	private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "R9JN30PFYLJ");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.spotify.music");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
        driver.findElement(By.xpath("//*[@contentDescription='Search']")).click();
        driver.findElement(By.xpath("//*[@text='Artists, songs, or podcasts']")).click();
        driver.findElement(By.xpath("//*[@text='a']")).click();
        driver.findElement(By.xpath("//*[@text='l']")).click();
        driver.findElement(By.xpath("//*[@text='w']")).click();
        driver.findElement(By.xpath("//*[@text='a']")).click();
        driver.findElement(By.xpath("//*[@text='y']")).click();
        driver.findElement(By.xpath("//*[@text='s']")).click();
        driver.findElement(By.xpath("//*[@text='Español (US)']")).click();
        driver.findElement(By.xpath("//*[@text='b']")).click();
        driver.findElement(By.xpath("//*[@text='o']")).click();
        driver.findElement(By.xpath("//*[@text='n']")).click();
        driver.findElement(By.xpath("//*[@text='Español (US)']")).click();
        driver.findElement(By.xpath("//*[@text='j']")).click();
        driver.findElement(By.xpath("//*[@text='o']")).click();
        driver.findElement(By.xpath("//*[@text='v']")).click();
        driver.findElement(By.xpath("//*[@text='i']")).click();
        driver.findElement(By.xpath("//*[@id='search_body']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@id='search_body']/*/*/*[@id='icon'])[1]")));
        driver.findElement(By.xpath("(//*[@id='search_body']/*/*/*[@id='icon'])[1]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='button_play_and_pause']")));
        driver.findElement(By.xpath("//*[@id='button_play_and_pause']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='track_info_view']")));
        driver.findElement(By.xpath("//*[@id='track_info_view']")).click();
        driver.findElement(By.xpath("//*[@id='play_pause_button']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

	


}
