import config.BaseClass;
import objects.AppiumObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestChrome extends BaseClass {
    static AppiumObject appiumObject;

    @BeforeClass
    public static void bTestChrome() {
        driver.get("https://appium.io/");
        appiumObject = PageFactory.initElements(driver, AppiumObject.class);
    }

    @Test
    public void test1() {
        appiumObject.printInfoButtoDownload();
    }
}
