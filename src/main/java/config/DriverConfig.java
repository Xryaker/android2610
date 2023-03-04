package config;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverConfig {
  private static RemoteWebDriver driver;

    public static RemoteWebDriver create(EMULATORS emulators){
        switch (emulators){
            case PIXEL2610 -> createPixel2610();
        }
        return driver;
    }

    private static void createPixel2610() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability("chromedriverExecutable", "C:\\driverandroidchrome\\chromedriver.exe");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");//указываем версию Android
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");//Имя OS
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "j7hefmhucq5dtcwk");//Сообщаем, что будет использоваться эмулятор
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1800);
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
